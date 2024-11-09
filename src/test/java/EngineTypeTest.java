import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import vehicles.cars.Engine;

import static vehicles.cars.EngineType.DIESEL;
import static vehicles.cars.EngineType.HYBRID;

public class EngineTypeTest {
    @DataProvider(name = "test data for constructor test")
    public Object[][] provider() {
        return new Object[][]{
                {new Engine(HYBRID, 2.0)},
                {new Engine(DIESEL, 0)}
        };
    }

    @Test(groups = "positive", dataProvider = "test data for constructor test")
    public void shouldTestConstructorWithPositiveData(Engine engine) {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(engine.getEngineCapacity(), 2.0, "The expected capacity is 2.0");
        soft.assertEquals(engine.getEngineType().name(), "HYBRID", "The expected name is HYBRID");
        soft.assertAll();
    }

    @Test(groups = "negative", dataProvider = "test data for constructor test")
    public void shouldTestConstructorWithNullArguments(Engine engine) {
        SoftAssert soft = new SoftAssert();
        soft.assertNotNull(engine.getEngineType(), "Type should not be NULL");
        soft.assertFalse(engine.getEngineCapacity() > 0, "Capacity must be greater than zero");
        soft.assertAll();
    }
}
