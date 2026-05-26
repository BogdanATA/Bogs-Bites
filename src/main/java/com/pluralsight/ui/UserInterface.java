package com.pluralsight.ui;

import com.pluralsight.models.Order;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private List<Order> order;

    public UserInterface(){
        this.scanner = new Scanner(System.in);
    }

    public void displayHomeScreen() {
        boolean running = true;
        while (running) {
            System.out.println("=== Welcome to Bog's Bites ===");
            System.out.println("1. New Order");
            System.out.println("0. Exit");

            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1 -> displayOrderScreen();
                case 0 -> {
                    System.out.println("GoodBye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    public void displayOrderScreen() {
        boolean running = true;
        while (running) {
            System.out.println("\n=== Order ===");
            System.out.println("1. Add Sandwich");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Chips");
            System.out.println("4. Checkout");
            System.out.println("0. Cancel Order");

            int choice = readInt("Enter your choice");

            switch (choice) {
                case 1 -> System.out.println("Add Sandwich");
                case 2 -> System.out.println("Add Drink");
                case 3 -> System.out.println("Add Chips");
                case 4 -> System.out.println("Checkout");
                case 0 -> {
                    System.out.println("Order Cancelled");
                    running = false;
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }




    /*---------------------------------------------------------------
     *                       Helper Methods
     * --------------------------------------------------------------*/
    private String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private int readInt(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(readString(prompt));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a whole number.");
            }
        }
    }

    private double readDouble(String prompt) {
        while (true) {
            try {
                return Double.parseDouble(readString(prompt));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number");
            }
        }
    }
}
