package com.pluralsight.models.toppings;

import com.pluralsight.enums.SandwichSize;
import com.pluralsight.enums.SauceType;

public class Sauce extends Topping{

    public Sauce(SauceType name) {
        super(name.toString());
    }

    @Override
    public double getPrice(SandwichSize sandwichSize) {
        return 0;
    }
}
