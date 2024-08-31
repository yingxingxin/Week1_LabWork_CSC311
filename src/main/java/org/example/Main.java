package org.example;

//Main method to test all methods
public class Main {
    public static void main(String[] args) {

        //Instantiate vehicle object
        Vehicle vehicle = new Vehicle(4, "red", 3.1f, "gasoline");

        //Instantiate car object
        Car car = new Car(4, "red", 3.1f, "gasoline", "Mercedes");

        //Tests honk method
        car.honk();

        //Tests display info method
        car.displayInfo();

    }
}