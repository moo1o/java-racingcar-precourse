package car;

import utils.NumberGenerator;

import java.util.List;

public class Cars {
    List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    /*
        자동차 랜덤숫자 부여
     */
    public void randomToCar(){
        for(Car car : carList){
            car.setValue(NumberGenerator.numberGenerate());
        }
    }

    /*
        자동차 이동
     */
    public void moveCars(){
        for(Car car : carList){
            car.moveCar();
        }
    }

    /*
        자동차 이동 출력
     */
    public void printCars(){
        for(Car car : carList){
            car.printCar();
        }
        System.out.println();
    }
}
