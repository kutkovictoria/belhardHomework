import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import vehicles.cars.Engine;
import vehicles.cars.Car;

import static vehicles.cars.EngineType.DIESEL;
import static vehicles.cars.EngineType.HYBRID;

public class CarTest {

    @Test(groups = "positive")
    public void shouldTestCarConstructor() {
        String expectedBrand = "BMW";
        String expectedColor = "Black";
        Engine expectedEngine = new Engine(DIESEL, 2.0);
        double expectedPrice = 30000;
        String expectedVehicleType = "passenger";

        Car car = new Car(expectedBrand, expectedColor, expectedEngine, expectedPrice, expectedVehicleType);

        SoftAssert soft = new SoftAssert();
        soft.assertEquals(car.getBrand(), expectedBrand, "Expected brand is BMW ");
        soft.assertEquals(car.getColor(), expectedColor, "Expected color is Black ");
        soft.assertEquals(car.getEngine().getEngineType(), expectedEngine.getEngineType(), "Engine type is DIESEL");
        soft.assertEquals(car.getEngine().getEngineCapacity(), expectedEngine.getEngineCapacity(), "Engine capacity is 2.0");
        soft.assertEquals(car.getPriceInUsd(), expectedPrice, "Expected price is 30000 ");
        soft.assertEquals(car.getVehiclesType(), expectedVehicleType, "Expected vehicle type is passenger");
        soft.assertAll();
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


