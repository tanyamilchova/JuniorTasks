package org.example.main.Condiments;

import org.example.main.Beverages.Beverage;

public class Whip extends CondimentDecorator{
    private Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }
    @Override
    public double cost() {
        return 0.21+ beverage.cost();
    }
}
