package FactoryCar;

public abstract class Car {
    public enum     CARTYPE{CAR,BUC,TRUCK};
    public enum FUEL_TYPE{DISEL,BENZIN,GAS}
    protected String name;
    protected CARTYPE cartype;
    protected double engine;
    protected FUEL_TYPE fuelType;
    protected int seats;
    protected double weight;

    protected double price;
    protected double razhod;


    public void prepareForTravel(){
        System.out.println("Preparing car "+name);
        System.out.println("Type "+cartype);
        System.out.println("Engine "+engine);
        System.out.println("Seats "+seats);
        System.out.println("Weight "+weight);
        System.out.println("Fuel "+fuelType);
    }
    public void calcFuel(){
        System.out.println("Car's razhod for 100 km" +razhod);
    }
    public void calkPrice(double promoDiscount){
        if(promoDiscount>0) {
            System.out.println("Discount!The price is "+(price-promoDiscount));
        }else {
            System.out.println("The price is "+price);
        }
    }

}
