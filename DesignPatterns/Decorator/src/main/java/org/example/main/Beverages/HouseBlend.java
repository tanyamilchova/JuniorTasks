package org.example.main.Beverages;

import org.example.main.Beverages.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        desctiption="House Blend Coffee";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
