import org.testng.annotations.Test;
import vehicles.cars.Engine;
import vehicles.cars.Car;

import static vehicles.cars.EngineType.DIESEL;
import static vehicles.cars.EngineType.HYBRID;
import static org.testng.Assert.*;

public class CarTest {

    @Test(groups = "positive")
    public void shouldTestCarConstructor() {
        String expectedBrand = "BMW";
        String expectedColor = "Black";
        Engine expectedEngine = new Engine(DIESEL, 2.0);
        double expectedPrice = 30000;
        String expectedVehicleType = "passenger";

        Car car = new Car(expectedBrand, expectedColor, expectedEngine, expectedPrice, expectedVehicleType);

        assertEquals(car.getBrand(), expectedBrand, "Expected brand is BMW ");
        assertEquals(car.getColor(), expectedColor, "Expected color is Black ");
        assertEquals(car.getEngine().getEngineType(), expectedEngine.getEngineType(), "Engine type is DIESEL");
        assertEquals(car.getEngine().getEngineCapacity(), expectedEngine.getEngineCapacity(), "Engine capacity is 2.0");
        assertEquals(car.getPriceInUsd(), expectedPrice, "Expected price is 30000 ");
        assertEquals(car.getVehiclesType(), expectedVehicleType, "Expected vehicle type is passenger");
    }


    @Test(expectedExceptions = IllegalArgumentException.class, groups = "negative")
    public void shouldTestConstructorWithNegativePrice() {
        new Car("Audi", "Red", new Engine(HYBRID, 1.8), -15000, "passenger");
    }

    @Test(expectedExceptions = NullPointerException.class, groups = "negative")
    public void shouldTestConstructorWithNullBrand() {
        new Car(null, "Red", new Engine(HYBRID, 1.8), 15000, "passenger");
    }
}


