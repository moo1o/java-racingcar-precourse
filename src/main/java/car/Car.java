package car;

import utils.CarStatus;

public class Car {
    private String name;
    private int value;
    private CarStatus status;
    private int distance;

    public Car(String name) {
        this.name = name;
        value = 0;
        status = CarStatus.STOP;
        distance = 0;
    }

    /*
     자동차 이동 메서드
     1. 값이 4이상 일 경우
      - 거리 증가(이동)
     2. 값이 3이하 일 경우
      - 정지
     */
    public void moveCar(){
        if(value >=4){
            status = CarStatus.GO;
            distance++;
        }else if(value <= 3){
            status = CarStatus.STOP;
        }
    }

    public CarStatus getStatus() {
        return status;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
