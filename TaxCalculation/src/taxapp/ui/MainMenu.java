package taxapp.ui;

import java.util.Scanner;

public class MainMenu {
    private final Scanner scanner = new Scanner(System.in);
    private final PropertyMenu propertyMenu = new PropertyMenu();
    private final VehicleMenu vehicleMenu = new VehicleMenu();
    private final TotalSummary totalSummary = new TotalSummary();

    public void show() {
    	int choice = -1;
        do {
            System.out.println("===== MAIN MENU =====");
            System.out.println("1. PROPERTY TAX");
            System.out.println("2. VEHICLE TAX");
            System.out.println("3. TOTAL");
            System.out.println("4. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");
            String input = scanner.nextLine();

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 4.\n");
                continue;
            }

            switch (choice) {
                case 1 -> propertyMenu.show();
                case 2 -> vehicleMenu.show();
                case 3 -> totalSummary.show();
                case 4 -> System.out.println("Exiting application... Goodbye!");
                default -> System.out.println("Invalid choice! Please select between 1 and 4.\n");
            }

        } while (choice != 4);
    }
}


//package taxapp.ui;
//
//import java.util.Scanner;
//
//public class MainMenu {
//    private final Scanner scanner = new Scanner(System.in);
//    private final PropertyMenu propertyMenu = new PropertyMenu();
//    private final VehicleMenu vehicleMenu = new VehicleMenu();
//    private final TotalSummary totalSummary = new TotalSummary();
//
//    public void show() {
//        int choice;
//        do {
//            System.out.println("1. PROPERTY TAX");
//            System.out.println("2. VEHICLE TAX");
//            System.out.println("3. TOTAL");
//            System.out.println("4. EXIT");
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
//                case 1 -> propertyMenu.show();
//                case 2 -> vehicleMenu.show();
//                case 3 -> totalSummary.show();
//                case 4 -> System.out.println("Exiting application... Goodbye!");
//                default -> System.out.println("Invalid choice! Please select between 1 and 4.");
//            }
//
//        } while (choice != 4);
//    }
//}
