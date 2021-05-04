package car;

public class Car {
    private String name;
    private int value;
    private int distance;

    public Car(String name) {
        this.name = name;
        value = -1;
        distance = 0;
    }

    /*
     자동차 이동 메서드
     1. 값이 4이상 일 경우
      - 거리 증가(이동)
     2. 값이 3이하 일 경우
      - 정지
     */
    public void moveCar() {
        if (value >= 4) {
            distance++;
        }
    }

    /*
       자동차 이동 출력
     */
    public void printCar() {
        System.out.print(this.name + " : ");
        for (int i = 0; i < this.distance; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public boolean containDistance(int distance) {
        return this.distance == distance;
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
