import car.Car;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @ParameterizedTest
    @CsvSource({"pobi", "crong", "honux"})
    public void carNameTest(String name){
        assertThat(new Car(name).getName()).isEqualTo(name);

    }
}
