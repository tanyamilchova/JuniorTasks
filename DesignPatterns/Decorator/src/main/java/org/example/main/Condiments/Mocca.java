package org.example.main.Condiments;

import org.example.main.Beverages.Beverage;

public class Mocca extends CondimentDecorator{
  private Beverage beverage;
    public Mocca(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocca";
    }
    @Override
    public double cost() {
        return 0.20+ beverage.cost();
    }
}
