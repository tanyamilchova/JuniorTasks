package org.example.main;

import org.example.main.Beverages.Beverage;
import org.example.main.Beverages.DarkRoast;
import org.example.main.Beverages.Espresso;
import org.example.main.Beverages.HouseBlend;
import org.example.main.Condiments.Mocca;
import org.example.main.Condiments.Whip;

public class DemoStarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+"$"+beverage.cost());

        Beverage beverage1=new HouseBlend();
        beverage1=new Mocca(beverage1);
        beverage1=new Mocca(beverage1);
        beverage1=new Whip(beverage1);
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());

        Beverage beverage2=new DarkRoast();
        beverage2=new Mocca(beverage2);
        beverage2=new Mocca(beverage2);
        beverage2=new Whip(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
    }
}
