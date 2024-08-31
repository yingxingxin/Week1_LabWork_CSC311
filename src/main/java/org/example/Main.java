package org.example;

public class Main {
    public static void main(String[] args) {

        //Instantiate vehicle object
        Vehicle vehicle = new Vehicle(4, "red", 3.1f, "gasoline");

        //Instantiate car object
        Car car = new Car(4, "red", 3.1f, "gasoline", "Mercedes");

        car.honk();
        car.displayInfo();

    }
}