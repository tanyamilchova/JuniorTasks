package FactoryCar;

public class TestDriveCarFactory {
    public static void main(String[] args) {
        CarFactorly carFactorly=new CarCarFactory();
        carFactorly.orderCar(3000);
    }
}
