package org.example;

public class Car extends Vehicle {

    String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    //Getter for brand
    public void setBrand() {
        this.brand = brand;
    }

    //Setter for brand
    public void honk() {
        System.out.println("Honk, honk!");

        }

        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Number of Wheels: " + numberOfWheels);
            System.out.println("Color: " + color);
            System.out.println("Engine Size: " + engineSize);
            System.out.println("Fuel Type: " + fuelType);
        }
    }

