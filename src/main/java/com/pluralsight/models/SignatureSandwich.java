package com.pluralsight.models;

import com.pluralsight.enums.*;
import com.pluralsight.models.toppings.*;

public class SignatureSandwich extends Sandwich{

    public SignatureSandwich() {
        super(BreadType.WHITE, SandwichSize.TWELVE);
        addTopping(new Meat(MeatType.STEAK));
        addTopping(new Meat(MeatType.STEAK));
        addTopping(new Cheese(CheeseType.PROVOLONE));
        addTopping(new Cheese(CheeseType.PROVOLONE));
        addTopping(new RegularTopping(RegularToppingType.ONIONS));
        addTopping(new RegularTopping(RegularToppingType.PEPPERS));
        addTopping(new RegularTopping(RegularToppingType.TOMATOES));
        addTopping(new Sauce(SauceType.MAYO));
        addTopping(new Side(SideType.AU_JUS));
        setToasted(true);
    }
}
