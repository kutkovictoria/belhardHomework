public class Car {

    private String brand;
    private String color;
    Engine engine; //
    private double priceInUsd;

    public Car(String brand, String color, Engine engine, double priceInUsd) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.priceInUsd = priceInUsd;
    }

    void printInfo(){
        System.out.printf("\nCar brand: %s\nCar color: %s\nCar engine type: %s\nCar engine capacity: %s\nCar price: %f USD\n----",
                brand, color, engine.getType(), engine.getCapacity(), priceInUsd);
    }
}
