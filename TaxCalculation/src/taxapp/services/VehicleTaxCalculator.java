package taxapp.services;

import taxapp.models.Vehicle;
import taxapp.models.PetrolVehicle;
import taxapp.models.DieselVehicle;
import taxapp.models.CngLpgVehicle;

public class VehicleTaxCalculator implements TaxCalculator<Vehicle> {

    @Override
    public double calculateTax(Vehicle vehicle) {
        double baseTax = 0;
        double purchaseCost = vehicle.getPurchaseCost();

        if (vehicle instanceof PetrolVehicle) {
            baseTax = purchaseCost * 0.08;  // 8% for petrol
        } else if (vehicle instanceof DieselVehicle) {
            baseTax = purchaseCost * 0.10;  // 10% for diesel
        } else if (vehicle instanceof CngLpgVehicle) {
            baseTax = purchaseCost * 0.06;  // 6% for CNG/LPG
        }

        // Additional surcharge for capacity > 4 seats
        if (vehicle.getCapacity() > 4) {
            baseTax += 500;  // fixed surcharge
        }

        return baseTax;
    }
}


//package taxapp.services;
//
//import taxapp.models.Vehicle;
//
//public class VehicleTaxCalculator implements TaxCalculator<Vehicle> {
//
//    @Override
//    public void calculateTax(Vehicle vehicle) {
//        // The actual tax calculation is implemented inside each vehicle subclass
//        vehicle.calculateTax();
//    }
//}
