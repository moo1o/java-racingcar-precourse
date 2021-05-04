package car;

import utils.Message;
import utils.NumberGenerator;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> carList;
    List<Car> winnerList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    /*
        car list 반환
     */
    public List<Car> getCarList(){
        return carList;
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

    /*
        우승자 체크
     */
    public void winnerCheck(){
        int winnerDistance = 0;
        winnerList = new ArrayList<>();
        for(Car car : carList){
            winnerDistance = Math.max(winnerDistance, car.getDistance());
        }
        for(Car car : carList) {
            addWinner(car, winnerDistance);
        }
    }

    /*
        우승자 추가
     */
    private void addWinner(Car car, int winnerDistance){
        if(car.getDistance() == winnerDistance){
            winnerList.add(car);
        }
    }

    /*
        우승자 출력
     */
    public void printWinner(){
        for(int i=0 ; i<winnerList.size() ; i++){
            System.out.print(winnerList.get(i).getName());
            comaOrResult(i);
        }
    }

    private void comaOrResult(int idx){
        if (winnerList.size() - 1 != idx)
            System.out.print(", ");
        else if(winnerList.size() - 1 == idx)
            System.out.print(Message.RESULT.getMessage());
    }
}
