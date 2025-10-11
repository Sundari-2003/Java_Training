package taxapp.ui;

import taxapp.exceptions.InvalidInputException;
import taxapp.models.Property;
import taxapp.services.PropertyTaxCalculator;
import taxapp.services.StorageService;
import taxapp.utils.ConsoleUtil;
import taxapp.utils.InputValidator;

import java.util.List;
import java.util.Scanner;

public class PropertyMenu {
    private final Scanner scanner = new Scanner(System.in);
    private final StorageService storage = StorageService.getInstance();
    private final PropertyTaxCalculator calculator = new PropertyTaxCalculator();

    public void show() {
        int choice = 0;
        do {
            System.out.println("\nPROPERTY TAX MENU:");
            System.out.println("1. ADD PROPERTY DETAILS");
            System.out.println("2. CALCULATE PROPERTY TAX");
            System.out.println("3. DISPLAY ALL PROPERTIES");
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
                case 1 -> addProperty();
                case 2 -> calculateTax();
                case 3 -> displayAllProperties();
                case 4 -> System.out.println("Returning to Main Menu...\n");
                default -> System.out.println("Invalid choice! Please select between 1 and 4.");
            }

        } while (choice != 4);
    }

//    private void addProperty() {
//        try {
//            System.out.println("\nENTER THE PROPERTY DETAILS");
//
//            double baseValue = InputValidator.readPositiveDouble(scanner, "ENTER THE BASE VALUE OF LAND: ");
//
//            double builtUpArea = InputValidator.readPositiveDouble(scanner, "ENTER THE BUILT-UP AREA OF LAND: ");
//
//            int age = InputValidator.readPositiveInt(scanner, "ENTER THE AGE OF LAND IN YEARS: ");
//
//            boolean inCity = InputValidator.readYesNo(scanner, "IS THE LAND LOCATED IN CITY (Y: YES, N: NO): ");
//
//            int id = storage.generatePropertyId();
//
//            Property property = new Property(id, builtUpArea, baseValue, age, inCity);
//            storage.addProperty(property);
//
//            System.out.println("Property added successfully with ID: " + id);
//
//        } catch (InvalidInputException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }

    private void addProperty() {
        System.out.println("\nENTER THE PROPERTY DETAILS");

        double baseValue = InputValidator.readPositiveDouble(scanner, "ENTER THE BASE VALUE OF LAND: ");
        double builtUpArea = InputValidator.readPositiveDouble(scanner, "ENTER THE BUILT-UP AREA OF LAND: ");
        int age = InputValidator.readPositiveInt(scanner, "ENTER THE AGE OF LAND IN YEARS: ");
        boolean inCity = InputValidator.readYesNo(scanner, "IS THE LAND LOCATED IN CITY (Y: YES, N: NO): ");

        int id = storage.generatePropertyId();

        Property property = new Property(id, builtUpArea, baseValue, age, inCity);
        storage.addProperty(property);

        System.out.println("Property added successfully with ID: " + id);
    }
    
    private void calculateTax() {
        List<Property> properties = storage.getProperties();

        if (properties.isEmpty()) {
            System.out.println("\nNo properties present at this moment.");
            return;
        }

        ConsoleUtil.printPropertyHeader();
        properties.forEach(p -> System.out.printf("%-8d %-15.2f %-12.2f %-12d %-8s %-12s%n",
                p.getId(), p.getBuiltUpArea(), p.getBaseValue(), p.getAge(),
                p.isInCity() ? "Y" : "N", "-"));
        ConsoleUtil.printLine(62);

        System.out.print("\nENTER THE PROPERTY ID TO CALCULATE THE TAX: ");
        String input = scanner.nextLine();
        int id;
        try {
            id = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid property ID!");
            return;
        }

        Property property = storage.getPropertyById(id);
        if (property == null) {
            System.out.println("Property with ID " + id + " not found.");
            return;
        }

        double tax = calculator.calculateTax(property);
        property.setPropertyTax(tax);

        System.out.printf("PROPERTY TAX FOR PROPERTY ID - %d IS %.2f%n", id, tax);
    }

    private void displayAllProperties() {
        List<Property> properties = storage.getProperties();
        if (properties.isEmpty()) {
            System.out.println("\nNo Data Present at This Moment.");
            return;
        }

        ConsoleUtil.printPropertyHeaderWithTax();
        properties.forEach(System.out::println);
        ConsoleUtil.printLine(66);
        System.out.println("\n-------------End of property Tax-------------------------------\n");
    }
}
