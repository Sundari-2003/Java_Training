package taxapp.models;

public class DieselVehicle extends Vehicle {
    public DieselVehicle(String registrationNumber, String brand, int maxVelocity, int capacity, double purchaseCost) {
        super(registrationNumber, brand, maxVelocity, capacity, purchaseCost);
    }

    @Override
    public String getVehicleTypeString() {
        return "Diesel";
    }
}

//package taxapp.models;
//
//public class DieselVehicle extends Vehicle {
//
//    public DieselVehicle(String registrationNumber, String brand, double maxVelocity, int capacity, double purchaseCost) {
//        super(registrationNumber, brand, maxVelocity, capacity, purchaseCost);
//    }
//
//    @Override
//    public void calculateTax() {
//        double tax = getMaxVelocity() + getCapacity() + 0.11 * getPurchaseCost();
//        setVehicleTax(tax);
//    }
//
//    @Override
//    public String getVehicleType() {
//        return "Diesel";
//    }
//}
