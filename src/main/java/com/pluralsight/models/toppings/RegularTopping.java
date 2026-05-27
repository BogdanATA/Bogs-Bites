package com.pluralsight.models.toppings;

import com.pluralsight.enums.RegularToppingType;
import com.pluralsight.enums.SandwichSize;

public class RegularTopping extends Topping{

    public RegularTopping(RegularToppingType name) {
        super(name.toString());
    }

    @Override
    public double getPrice(SandwichSize sandwichSize) {
        return 0;
    }
}
