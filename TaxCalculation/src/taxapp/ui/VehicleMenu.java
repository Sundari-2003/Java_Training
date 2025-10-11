package taxapp.ui;

import taxapp.exceptions.DuplicateRegistrationException;
import taxapp.exceptions.InvalidInputException;
import taxapp.models.Vehicle;
import taxapp.models.PetrolVehicle;
import taxapp.models.DieselVehicle;
import taxapp.models.CngLpgVehicle;
import taxapp.services.StorageService;
import taxapp.services.VehicleTaxCalculator;
import taxapp.utils.ConsoleUtil;
import taxapp.utils.InputValidator;

import java.util.List;
import java.util.Scanner;

public class VehicleMenu {

    private final Scanner scanner = new Scanner(System.in);
    private final StorageService storage = StorageService.getInstance();
    private final VehicleTaxCalculator calculator = new VehicleTaxCalculator();

    public void show() {
        int choice = -1; // Initialize to invalid value
        do {
            System.out.println("\nVEHICLE TAX MENU:");
            System.out.println("1. ADD VEHICLE DETAILS");
            System.out.println("2. CALCULATE VEHICLE TAX");
            System.out.println("3. DISPLAY ALL VEHICLES");
            System.out.println("4. BACK TO MAIN MENU");
            System.out.print("ENTER YOUR CHOICE: ");
            String input = scanner.nextLine();

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 4.");
                continue;
            }

            switch (choice) {
                case 1 -> addVehicle();
                case 2 -> calculateTax();
                case 3 -> displayAllVehicles();
                case 4 -> System.out.println("Returning to Main Menu...\n");
                default -> System.out.println("Invalid choice! Please select between 1 and 4.");
            }

        } while (choice != 4);
    }

    private void addVehicle() {
        try {
            System.out.print("\nENTER THE VEHICLE REGISTRATION NUMBER (4 digits): ");
            String regNo = scanner.nextLine().trim();

            if (!InputValidator.isValidRegistrationNumber(regNo)) {
                throw new InvalidInputException("Invalid registration number format.");
            }

            if (storage.getVehicleByRegistration(regNo) != null) {
                throw new DuplicateRegistrationException("Registration number already exists.");
            }

            System.out.print("ENTER BRAND OF THE VEHICLE: ");
            String brand = scanner.nextLine().trim();
            if (brand.isEmpty()) {
                throw new InvalidInputException("Brand cannot be empty.");
            }

            int maxVelocity = InputValidator.readIntInRange(scanner, "ENTER THE MAXIMUM VELOCITY OF THE VEHICLE (KMPH): ", 120, 300);
            int capacity = InputValidator.readIntInRange(scanner, "ENTER CAPACITY (NUMBER OF SEATS) OF THE VEHICLE: ", 2, 50);

            System.out.println("CHOOSE THE TYPE OF THE VEHICLE");
            System.out.println("1. PETROL DRIVEN");
            System.out.println("2. DIESEL DRIVEN");
            System.out.println("3. CNG/LPG DRIVEN");
            int type = InputValidator.readIntInRange(scanner, "ENTER YOUR CHOICE: ", 1, 3);

            double purchaseCost = InputValidator.readDoubleInRange(scanner, "ENTER THE PURCHASE COST OF THE VEHICLE: ", 50000, 1000000);

            Vehicle vehicle;
            switch (type) {
                case 1 -> vehicle = new PetrolVehicle(regNo, brand, maxVelocity, capacity, purchaseCost);
                case 2 -> vehicle = new DieselVehicle(regNo, brand, maxVelocity, capacity, purchaseCost);
                case 3 -> vehicle = new CngLpgVehicle(regNo, brand, maxVelocity, capacity, purchaseCost);
                default -> throw new InvalidInputException("Invalid vehicle type.");
            }

            storage.addVehicle(vehicle);
            System.out.println("Vehicle added successfully.");

        } catch (InvalidInputException | DuplicateRegistrationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void calculateTax() {
        List<Vehicle> vehicles = storage.getVehicles();
        if (vehicles.isEmpty()) {
            System.out.println("\nNo vehicles present at this moment.");
            return;
        }

        ConsoleUtil.printVehicleHeader();
        vehicles.forEach(v -> System.out.printf("%-16s %-10s %-14d %-13d %-13s %-14.2f %-11s%n",
                v.getRegistrationNumber(), v.getBrand(), v.getMaxVelocity(),
                v.getCapacity(), v.getVehicleTypeString(), v.getPurchaseCost(), "-"));
        ConsoleUtil.printLine(94);

        System.out.print("\nENTER THE REGISTRATION NO OF THE VEHICLE TO CALCULATE THE TAX: ");
        String regNo = scanner.nextLine().trim();

        Vehicle vehicle = storage.getVehicleByRegistration(regNo);
        if (vehicle == null) {
            System.out.println("Vehicle with registration number " + regNo + " not found.");
            return;
        }

        double tax = calculator.calculateTax(vehicle);
        vehicle.setVehicleTax(tax);

        System.out.printf("VEHICLE TAX FOR REGISTRATION NO - %s IS %.2f%n", regNo, tax);
    }

    private void displayAllVehicles() {
        List<Vehicle> vehicles = storage.getVehicles();
        if (vehicles.isEmpty()) {
            System.out.println("\nNo Data Present at This Moment.");
            return;
        }

        ConsoleUtil.printVehicleHeader();
        vehicles.forEach(System.out::println);
        ConsoleUtil.printLine(94);
        System.out.println("\n-------------End of Vehicle Tax-------------------------------\n");
    }
}



//package taxapp.ui;
//
//import taxapp.exceptions.DuplicateRegistrationException;
//import taxapp.exceptions.InvalidInputException;
//import taxapp.models.Vehicle;
//import taxapp.models.PetrolVehicle;
//import taxapp.models.DieselVehicle;
//import taxapp.models.CngLpgVehicle;
//import taxapp.services.StorageService;
//import taxapp.services.VehicleTaxCalculator;
//import taxapp.utils.ConsoleUtil;
//import taxapp.utils.InputValidator;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class VehicleMenu {
//    private final Scanner scanner = new Scanner(System.in);
//    private final StorageService storage = StorageService.getInstance();
//    private final VehicleTaxCalculator calculator = new VehicleTaxCalculator();
//
//    public void show() {
//        int choice;
//        do {
//            System.out.println("\nVEHICLE TAX MENU:");
//            System.out.println("1. ADD VEHICLE DETAILS");
//            System.out.println("2. CALCULATE VEHICLE TAX");
//            System.out.println("3. DISPLAY ALL VEHICLES");
//            System.out.println("4. BACK TO MAIN MENU");
//            System.out.print("ENTER YOUR CHOICE: ");
//            String input = scanner.nextLine();
//
//            try {
//                choice = Integer.parseInt(input);
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input! Please enter a number between 1 and 4.");
//                continue;
//            }
//
//            switch (choice) {
//                case 1 -> addVehicle();
//                case 2 -> calculateTax();
//                case 3 -> displayAllVehicles();
//                case 4 -> System.out.println("Returning to Main Menu...\n");
//                default -> System.out.println("Invalid choice! Please select between 1 and 4.");
//            }
//        } while (choice != 4);
//    }
//
//    private void addVehicle() {
//        try {
//            System.out.print("\nENTER THE VEHICLE REGISTRATION NUMBER (4 digits): ");
//            String regNo = scanner.nextLine().trim();
//
//            if (!InputValidator.isValidRegistrationNumber(regNo))
//                throw new InvalidInputException("Invalid registration number format.");
//
//            if (storage.getVehicleByRegistration(regNo) != null)
//                throw new DuplicateRegistrationException("Registration number already exists.");
//
//            System.out.print("ENTER BRAND OF THE VEHICLE: ");
//            String brand = scanner.nextLine().trim();
//            if (brand.isEmpty())
//                throw new InvalidInputException("Brand cannot be empty.");
//
//            int maxVelocity = InputValidator.readIntInRange(scanner, "ENTER THE MAXIMUM VELOCITY OF THE VEHICLE (KMPH): ", 120, 300);
//            int capacity = InputValidator.readIntInRange(scanner, "ENTER CAPACITY (NUMBER OF SEATS) OF THE VEHICLE: ", 2, 50);
//
//            System.out.println("CHOOSE THE TYPE OF THE VEHICLE");
//            System.out.println("1. PETROL DRIVEN");
//            System.out.println("2. DIESEL DRIVEN");
//            System.out.println("3. CNG/LPG DRIVEN");
//            int type = InputValidator.readIntInRange(scanner, "ENTER YOUR CHOICE: ", 1, 3);
//
//            double purchaseCost = InputValidator.readDoubleInRange(scanner, "ENTER THE PURCHASE COST OF THE VEHICLE: ", 50000, 1000000);
//
//            Vehicle vehicle;
//            switch (type) {
//                case 1 -> vehicle = new PetrolVehicle(regNo, brand, maxVelocity, capacity, purchaseCost);
//                case 2 -> vehicle = new DieselVehicle(regNo, brand, maxVelocity, capacity, purchaseCost);
//                case 3 -> vehicle = new CngLpgVehicle(regNo, brand, maxVelocity, capacity, purchaseCost);
//                default -> throw new InvalidInputException("Invalid vehicle type.");
//            }
//
//            storage.addVehicle(vehicle);
//            System.out.println("Vehicle added successfully.");
//
//        } catch (InvalidInputException | DuplicateRegistrationException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//
//    private void calculateTax() {
//        List<Vehicle> vehicles = storage.getVehicles();
//        if (vehicles.isEmpty()) {
//            System.out.println("\nNo vehicles present at this moment.");
//            return;
//        }
//
//        ConsoleUtil.printVehicleHeader();
//        vehicles.forEach(v -> System.out.printf("%-16s %-10s %-14d %-13d %-13s %-14.2f %-11s%n",
//                v.getRegistrationNumber(), v.getBrand(), v.getMaxVelocity(),
//                v.getCapacity(), v.getVehicleTypeString(), v.getPurchaseCost(), "-"));
//        ConsoleUtil.printLine(94);
//
//        System.out.print("\nENTER THE REGISTRATION NO OF THE VEHICLE TO CALCULATE THE TAX: ");
//        String regNo = scanner.nextLine().trim();
//
//        Vehicle vehicle = storage.getVehicleByRegistration(regNo);
//        if (vehicle == null) {
//            System.out.println("Vehicle with registration number " + regNo + " not found.");
//            return;
//        }
//
//        double tax = calculator.calculateTax(vehicle);
//        vehicle.setVehicleTax(tax);
//
//        System.out.printf("VEHICLE TAX FOR REGISTRATION NO - %s IS %.2f%n", regNo, tax);
//    }
//
//    private void displayAllVehicles() {
//        List<Vehicle> vehicles = storage.getVehicles();
//        if (vehicles.isEmpty()) {
//            System.out.println("\nNo Data Present at This Moment.");
//            return;
//        }
//        ConsoleUtil.printVehicleHeader();
//        vehicles.forEach(System.out::println);
//        ConsoleUtil.printLine(94);
//        System.out.println("\n-------------End of Vehicle Tax-------------------------------\n");
//    }
//
