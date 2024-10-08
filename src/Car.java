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

    public void printInfo(){
        System.out.printf("\nvehicle.Car brand: %s\nvehicle.Car color: %s\nvehicle.Car engine type: %s\nvehicle.Car engine capacity: %s\nvehicle.Car price: %f USD\n----",
                brand, color, engine.getType(), engine.getCapacity(), priceInUsd);
    }
}
