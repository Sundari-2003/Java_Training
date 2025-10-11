package taxapp.ui;

import taxapp.models.Property;
import taxapp.models.Vehicle;
import taxapp.services.StorageService;
import taxapp.utils.ConsoleUtil;

import java.util.List;

public class TotalSummary {

    private final StorageService storage = StorageService.getInstance();

    public void show() {
        List<Property> properties = storage.getProperties();
        List<Vehicle> vehicles = storage.getVehicles();

        double totalPropertyTax = properties.stream()
                .mapToDouble(Property::getPropertyTax)
                .sum();

        double totalVehicleTax = vehicles.stream()
                .mapToDouble(Vehicle::getVehicleTax)
                .sum();

        ConsoleUtil.printLine(50);
        System.out.println("TOTAL TAX SUMMARY");
        ConsoleUtil.printLine(50);

        System.out.printf("Total Property Tax: %.2f%n", totalPropertyTax);
        System.out.printf("Total Vehicle Tax:  %.2f%n", totalVehicleTax);
        ConsoleUtil.printLine(50);
        System.out.printf("GRAND TOTAL TAX:    %.2f%n", totalPropertyTax + totalVehicleTax);
        ConsoleUtil.printLine(50);
        System.out.println();
    }
}
