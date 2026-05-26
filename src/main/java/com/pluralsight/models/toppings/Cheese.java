package com.pluralsight.models.toppings;

import com.pluralsight.enums.SandwichSize;

public class Cheese extends PremiumTopping{

    public Cheese(String name) {
        super(name);
    }

    public double getPrice(SandwichSize sandwichSize) {
        double cheeseCost = 0;
        if (isExtra) {
            switch(sandwichSize){
                case FOUR -> cheeseCost = 0.30;
                case EIGHT -> cheeseCost = 0.60;
                case TWELVE -> cheeseCost = 0.90;
            }
        } else {
            switch(sandwichSize){
                case FOUR -> cheeseCost = 0.75;
                case EIGHT -> cheeseCost = 1.50;
                case TWELVE -> cheeseCost = 2.25;
            }
        }
        return cheeseCost;
    }
}
