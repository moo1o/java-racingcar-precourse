package car;

import utils.CarStatus;

public class Car {
    private String name;
    private int value;
    private int distance;

    public Car(String name) {
        this.name = name;
        value = 0;
        distance = 0;
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
}
