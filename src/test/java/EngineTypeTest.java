import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import vehicles.cars.Engine;

import static vehicles.cars.EngineType.DIESEL;
import static vehicles.cars.EngineType.HYBRID;
import static org.testng.Assert.*;

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
        assertEquals(engine.getEngineCapacity(), 2.0, "The expected capacity is 2.0");
        assertEquals(engine.getEngineType().name(), "HYBRID", "The expected name is HYBRID");
    }

    @Test(groups = "negative", dataProvider = "test data for constructor test")
    public void shouldTestConstructorWithNullArguments(Engine engine) {
        assertNotNull(engine.getEngineType(), "Type should not be NULL");
        assertFalse(engine.getEngineCapacity() > 0, "Capacity must be greater than zero");
    }
}
