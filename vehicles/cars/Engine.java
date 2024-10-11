package vehicles.cars;

public class Engine {

    private String engineType;
    private double engineCapacity;

    public Engine(String type, double capacity) {
        this.engineType = type;
        this.engineCapacity = capacity;
    }

    public String getEngineType() {
        return engineType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }
}
