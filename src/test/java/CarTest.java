import car.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import utils.CarStatus;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    private Car car;

    @ParameterizedTest
    @CsvSource({"pobi", "crong", "honux"})
    public void createCarTest(String name){
        car = new Car(name);
        assertThat(car.getName()).isEqualTo(name);
        assertThat(car.getStatus()).isEqualTo(CarStatus.STOP);
        assertThat(car.getValue()).isEqualTo(0);
        assertThat(car.getDistance()).isEqualTo(0);
    }

    @Test
    public void moveTest(){
        car = new Car("pobi");
        car.setValue(2); //3이하 -> 정지
        car.moveCar();
        assertThat(car.getStatus()).isEqualTo(CarStatus.STOP);
        assertThat(car.getDistance()).isEqualTo(0);

        car = new Car("crong");
        car.setValue(5); //4이상 -> 한칸 이동
        car.moveCar();
        assertThat(car.getStatus()).isEqualTo(CarStatus.GO);
        assertThat(car.getDistance()).isEqualTo(1);
    }
}
