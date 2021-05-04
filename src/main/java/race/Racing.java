package race;

import car.Cars;

public class Racing {
    public static void racingCars(Cars cars) {
        cars.randomToCar();
        cars.moveCars();
        cars.printCars();
    }
}
