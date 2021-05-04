package race;

import car.Car;
import car.Cars;

import java.util.List;

public class Racing {
    public static void racingCars(Cars cars){
        cars.randomToCar();
        cars.moveCars();
        cars.printCars();
    }
}
