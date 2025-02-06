package services;

import models.Car;
import models.Customer;
import models.transaction;
import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Car> cars = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<RentalTransaction> transactions = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
customers.add(customer);
    }

    public RentalTransaction rentCar(String carId, String customerId, int days) {
        Car car = cars.stream().filter(c -> c.getId().equals(carId) && c.isAvailable()).findFirst().orElse(null);
        Customer customer = customers.stream().filter(c -> c.getId().equals(customerId)).findFirst().orElse(null);

        if (car!= null && customer!= null) {
RentalTransaction transaction = new RentalTransaction(car, customer, days);
            transactions.add(transaction);
            return transaction;
        }
