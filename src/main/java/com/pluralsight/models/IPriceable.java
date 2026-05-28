package com.pluralsight.models;

public interface IPriceable {

    /**
     * Returns the price of this item
     *
     * @return The price as a double
     */
    double getPrice();

    /**
     * Returns the display name of this item
     *
     * @return The name as a String
     */
    String getName();
}