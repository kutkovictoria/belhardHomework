package vehicles.cars;

import vehicles.VehiclesItem;

public class Car extends VehiclesItem {

    private String color;
    private Engine engine;

    public Car(String brand, String color, Engine engine, double priceInUsd, String vehiclesType) {
        if (brand == null || color == null || engine == null || vehiclesType == null) {
            throw new NullPointerException("None of the fields can be null.");
        }
        if (priceInUsd < 0) {
            throw new IllegalArgumentException("Price must be greater than zero.");
        }
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.priceInUsd = priceInUsd;
        this.vehiclesType = vehiclesType;
    }
    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void printCarInfo() {
        System.out.printf("\nCar brand: %s\nCar color: %s\nCar engine type: %s\n" +
                        "Car engine capacity: %f\nCar price: %f USD\nVehicles type: %s\n----",
                brand, color, engine.getEngineType(), engine.getEngineCapacity(), priceInUsd, vehiclesType);
    }
}
