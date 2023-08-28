package FactoryCar;

public  class CarFactorly {

    public Car orderCar(double weight){
        Car car=createCar(weight);
        car.prepareForTravel();
        car.calcFuel();
        return car;
    }
    protected  Car createCar(double weight){
        if(weight<=2000){
            return new CarCar();
        }else {
            if(weight>2000 && weight<=4000){
                return new Bus();
            }
            else {
                return new Truck();
            }
        }
    }
}
