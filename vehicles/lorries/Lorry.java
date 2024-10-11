package vehicles.lorries;

import vehicles.VehiclesItem;

public class Lorry extends VehiclesItem {

    private double loadCapacity;
    private LorryBack lorryBack;

    public Lorry(String brand, double priceInUsd, String vehiclesType, double loadCapacity, LorryBack lorryBack) {
        this.brand = brand;
        this.priceInUsd = priceInUsd;
        this.vehiclesType = vehiclesType;
        this.loadCapacity = loadCapacity;
        this.lorryBack = lorryBack;
    }

    public Lorry(String brand, double priceInUsd, String vehiclesType, double loadCapacity, double lorryBackSize, String lorryBackType) {
        this.brand = brand;
        this.priceInUsd = priceInUsd;
        this.vehiclesType = vehiclesType;
        this.loadCapacity = loadCapacity;
        this.lorryBack = new LorryBack(lorryBackSize, lorryBackType);
    }

    public void printLorryInfo(){
        System.out.printf("\nLorry brand: %s\nLorry load capacity: %f\nLorry back size: %f\n" +
                        "Lorry back type: %s\nLorry price: %f USD\nVehicles type: %s\n----",
                brand, loadCapacity, lorryBack.getLoryBackSize(), lorryBack.getLorryBackType(), priceInUsd, vehiclesType);
    }
}
