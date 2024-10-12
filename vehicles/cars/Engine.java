package vehicles.cars;

public class Engine {

    private EngineType engineType;
    private double engineCapacity;

    public Engine(EngineType engineType, double engineCapacity) {
        this.engineType = engineType;
        this.engineCapacity = engineCapacity;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }
}
