package FactoryCar;

public class Truck extends Car{
    public Truck() {
        cartype=CARTYPE.TRUCK;
        name="TruckMerc";
        engine=3.5;
        fuelType=FUEL_TYPE.DISEL;
        seats=2;
        weight=7000;
        price=920;
        razhod=32;
    }
}
