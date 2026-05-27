package com.pluralsight.models;

import com.pluralsight.enums.ChipType;

public class Chips implements IPriceable{
    private ChipType name;

    public Chips(ChipType name) {
        this.name = name;
    }

    public ChipType getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "name=" + name +
                '}';
    }
}
