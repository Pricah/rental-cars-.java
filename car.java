package models;

public class Car {
    private String id;
    private String model;
    private String brand;
    private double rentalPrice;
    private boolean isAvailable;

    public Car(String id, String model, String brand, double rentalPrice) {
        this.id = id;
        this.model = model;
this.brand = brand;
        this.rentalPrice = rentalPrice;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rentCar() {
isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public String getId() {
return id;
    }

    @Override
    public String toString() {
        return brand + " " + model + " (ID: " + id + ") - " + (isAvailable? "Available" : "Rented");
    }
}

