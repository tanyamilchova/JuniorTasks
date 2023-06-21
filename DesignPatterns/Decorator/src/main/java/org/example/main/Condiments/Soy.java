package org.example.main.Condiments;

import org.example.main.Beverages.Beverage;

public class Soy extends CondimentDecorator{
    private Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage=beverage;
    }
    public Size getSize(){
        return beverage.getSize();
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+"Soy";
    }
    @Override
    public double cost() {
        double cost=beverage.cost();

        return 0;
    }


}
