package com.pluralsight.models.toppings;

import com.pluralsight.enums.SandwichSize;
import com.pluralsight.enums.SideType;

public class Side extends Topping{

    public Side(SideType name) {
        super(name.toString());
    }

    @Override
    public double getPrice(SandwichSize sandwichSize) {
        return 0;
    }
}
