package ch06.sec07.exam05;

public class Car {

    String company = "Hyundai";
    String model;
    String color;
    int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car() {
        this("private Car", "white", 200);
    }

    public Car(String model) {
        this(model, "white", 200);
    }

    public Car(String model, String color) {
        this(model, color, 200);
    }

    public Car(String model, int maxSpeed) {
        this(model, "white", maxSpeed);
    }
}
