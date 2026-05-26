package com.pluralsight.models.toppings;

import com.pluralsight.enums.SandwichSize;

public abstract class PremiumTopping extends Topping{
    protected boolean isExtra;

    public PremiumTopping(String name) {
        super(name);
        this.isExtra = false;
    }

    @Override
    public abstract double getPrice(SandwichSize sandwichSize);
}
