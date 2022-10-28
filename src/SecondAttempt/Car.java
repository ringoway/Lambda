package SecondAttempt;

import SecondAttempt.Car;

public class Car implements Comparable<Car>{
    private String brand;
    private String model;
    private int yearOfIssue;
    private int maxSpeed;
    private int horsepower;
    public Car(String brand, String model, int yearOfIssue, int maxSpeed, int horsepower){
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.maxSpeed = maxSpeed;
        this.horsepower = horsepower;
    }

    public int compareTo(Car a) {
        return this.maxSpeed - a.maxSpeed;
    }
    public String toString() {
        return model+" and his speed: "+maxSpeed+" km/h";
    }
}