import car.Car;
import car.Cars;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    private Cars cars;

    @BeforeEach
    public void init() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("pobi"));
        carList.add(new Car("crong"));
        carList.add(new Car("honux"));
        cars = new Cars(carList);
    }

    @Test
    public void random2CarTest() {
        List<Integer> values = new ArrayList<>();
        for (Car car : cars.getCarList()) {
            int value = car.getValue();
            values.add(value);
        }
        cars.randomToCar();
        List<Car> carList = cars.getCarList();
        for (int i = 0; i < carList.size(); i++) {
            System.out.println("carList.get(i).getValue()" + carList.get(i).getValue());
            System.out.println("values.get(i)" + values.get(i));
            assertThat(carList.get(i).getValue()).isNotEqualTo(values.get(i));
        }
    }

    @Test
    public void winnerCheckTest() {
        for (int i = 0; i < cars.getCarList().size(); i++) {
            cars.getCarList().get(i).setValue(i);
        }
        cars.moveCars();
        List<Car> winnerList = cars.winnerCheck();
        assertThat(winnerList).isEqualTo(cars.getCarList());

        for (int i = 0; i < cars.getCarList().size(); i++) {
            cars.getCarList().get(i).setValue(i + 3);
        }
        cars.moveCars();
        winnerList = cars.winnerCheck();
        for (Car car : winnerList) {
            System.out.println(car.getName());
        }
        for (Car car : winnerList) {
            assertThat(car.getName().equals("crong") || car.getName().equals("honux")).isTrue();
        }

    }
}
