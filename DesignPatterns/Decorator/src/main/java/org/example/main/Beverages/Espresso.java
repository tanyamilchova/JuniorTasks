package org.example.main.Beverages;

import org.example.main.Beverages.Beverage;

public class Espresso extends Beverage {
    public Espresso(){
        desctiption="Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
