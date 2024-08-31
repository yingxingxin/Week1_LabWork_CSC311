package org.example;

//class called Vehicle
public class Vehicle {

    int numberOfWheels;
    String color;
    float engineSize;
    String fuelType;

    //Constructor
    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }


    //Getter for number of wheels
    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    //Setter for number of wheels
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    //Getter for color
    public String getColor() {
        return this.color;
    }

    //Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    //Getter for engine size
    public float getEngineSize() {
        return this.engineSize;
    }

    //Setter for engine size
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    //Getter for fuel type
    public String getFuelType() {
        return this.fuelType;
    }

    //Setter for fuel type
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

}


