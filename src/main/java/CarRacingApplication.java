import car.Car;
import car.Cars;
import race.Racing;
import utils.InputApi;
import utils.Message;

import java.util.ArrayList;
import java.util.List;

public class CarRacingApplication {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        Cars cars;
        System.out.print(Message.ASK_NAME.getMessage());
        String input = InputApi.input();
        String[] names = input.split(",");
        // 이름 앞뒤 공백 제거 후 자동차 객체 생성
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].trim();
            carList.add(new Car(names[i]));
        }
        cars = new Cars(carList);
        System.out.print(Message.ASK_TIMES.getMessage());
        int times = Integer.parseInt(InputApi.input());

        System.out.print(Message.START.getMessage());
        for (int i = 0; i < times; i++) {
            Racing.racingCars(cars);
        }
        cars.winnerCheck();
        cars.printWinner();
    }


}
