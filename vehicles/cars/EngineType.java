package vehicles.cars;

public enum EngineType {

    PETROL("petrol"),
    DIESEL("diesel"),
    GAZ("gaz"),
    HYBRID("hybrid");

    String engineTypeToBeDisplayed;

    EngineType(String engineTypeToBeDisplayed) {
        this.engineTypeToBeDisplayed = engineTypeToBeDisplayed;
    }
}
