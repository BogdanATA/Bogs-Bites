package com.pluralsight.models.toppings;

import com.pluralsight.enums.SandwichSize;

public abstract class Topping {
    private String name;
    protected boolean isExtra;

    public Topping(String name) {
        this.name = name;
        this.isExtra = false;
    }

    public String getName() {
        return name;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }

    public abstract double getPrice(SandwichSize sandwichSize);
}
