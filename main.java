package src;

import models.Car;
import models.Customer;
import models.RentalTransaction;
import services.RentalAgency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentalAgency agency = new RentalAgency();

        // Adding sample cars
        agency.addCar(new Car("C001", "Model S", "Tesla", 100));
agency.addCar(new Car("C002", "Civic", "Honda", 50));
        agency.addCar(new Car("C003", "Corolla", "Toyota", 60));

        // Adding sample customers
        agency.addCustomer(new Customer("CU001", "Alice Johnson", "alice@example.com"));
        agency.addCustomer(new Customer("CU002", "Bob Smith", "bob@example.com"));

while(true) {
            System.out.println("
--- Car Rental System ---");
            System.out.println("1. Show Available Cars");
            System.out.println("2. Rent a Car");
System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("
Available Cars:");
agency.showAvailableCars();
                    break;

                case 2:
System.out.print("
Enter Customer ID: ");
                    String customerId = scanner.nextLine();

System.out.print("Enter Car ID: ");
                    String carId = scanner.nextLine();

System.out.print("Enter Number of Rental Days: ");
                    int days = scanner.nextInt();

RentalTransaction transaction = agency.rentCar(carId, customerId, days);
                    if (transaction!= null) {
System.out.println("Rental Successful!");
                        System.out.println(transaction);
} else {
                        System.out.println("Rental Failed! Car may not be available or Customer ID incorrect.");
}
                    break;

                case 3:
System.out.println("Exiting the system.");
                    scanner.close();
                    return;

default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
