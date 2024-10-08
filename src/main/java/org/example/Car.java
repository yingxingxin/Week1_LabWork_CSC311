package org.example;

//Car child class
public class Car extends Vehicle {

    String brand;

    //Constructor
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    //Getter of brand
    public String getBrand() {
        return this.brand;
    }

    //Setter for brand
    public void setBrand() {
        this.brand = brand;
    }

    //Method that prints honk
    public void honk() {
        System.out.println("Honk, honk!");
    }

        //Method that prints all the attributes
        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Number of Wheels: " + numberOfWheels);
            System.out.println("Color: " + color);
            System.out.println("Engine Size: " + engineSize);
            System.out.println("Fuel Type: " + fuelType);
        }
    }

