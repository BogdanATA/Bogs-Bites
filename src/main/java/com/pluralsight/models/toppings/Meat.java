package com.pluralsight.models.toppings;

import com.pluralsight.enums.SandwichSize;

public class Meat extends PremiumTopping{

    public Meat(String name) {
        super(name);
    }

    public double getPrice(SandwichSize sandwichSize) {
        double meatCost = 0;
        if (isExtra) {
            switch(sandwichSize){
                case FOUR -> meatCost = 0.50;
                case EIGHT -> meatCost = 1.00;
                case TWELVE -> meatCost = 1.50;
            }
        } else {
            switch(sandwichSize){
                case FOUR -> meatCost = 1.00;
                case EIGHT -> meatCost = 2.00;
                case TWELVE -> meatCost = 3.00;
            }
        }
        return meatCost;
    }
}
