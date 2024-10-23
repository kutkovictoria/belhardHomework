import org.testng.Assert;
import org.testng.annotations.Test;
import vehicles.cars.Engine;
import vehicles.cars.EngineType;
import vehicles.cars.Car;

public class CarTest {

    @Test(groups = "positive")
    public void shouldTestCarConstructor(){
        String expectedBrand = "BMW";
        String expectedColor = "Black";
        Engine expectedEngine = new Engine(EngineType.DIESEL, 2.0);
        double expectedPrice = 30000.00;
        String expectedVehicleType = "passenger";

        Car car = new Car(expectedBrand, expectedColor, expectedEngine, expectedPrice, expectedVehicleType);
        Assert.assertEquals(car.getBrand(), expectedBrand, "Brand ");
        Assert.assertEquals(car.getColor(), expectedColor, "Color ");
        Assert.assertEquals(car.getEngine().getEngineCapacity(), expectedEngine.getEngineType(), "Engine type ");
        Assert.assertEquals(car.getPriceInUsd(), expectedPrice, "Price ");
        Assert.assertEquals(car.getVehiclesType(), expectedVehicleType, "Vehicle type ");

    }
}
