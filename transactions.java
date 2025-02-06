package models;

public class RentalTransaction {
    private Car car;
    private Customer customer;
    private int rentalDays;
    private double totalCost;

    public RentalTransaction(Car car, Customer customer, int rentalDays) {
        this.car = car;
        this.customer = customer;
this.rentalDays = rentalDays;
        this.totalCost = car.getRentalPrice() * rentalDays;
        car.rentCar(); // Mark the car as rented
    }

    public void completeRental() {
        car.returnCar(); // Mark the car as available again
    }

@Override
    public String toString() {
        return "Transaction: " + customer + " rented " + car + 
               " for " + rentalDays + " days. Total: $" + totalCost;
    }
}
