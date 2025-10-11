package taxapp.models;

public class PetrolVehicle extends Vehicle {
    public PetrolVehicle(String registrationNumber, String brand, int maxVelocity, int capacity, double purchaseCost) {
        super(registrationNumber, brand, maxVelocity, capacity, purchaseCost);
    }

    @Override
    public String getVehicleTypeString() {
        return "Petrol";
    }
}




//package taxapp.models;
//
//public class PetrolVehicle extends Vehicle {
//
//    public PetrolVehicle(String registrationNumber, String brand, double maxVelocity, int capacity, double purchaseCost) {
//        super(registrationNumber, brand, maxVelocity, capacity, purchaseCost);
//    }
//
//    @Override
//    public void calculateTax() {
//        double tax = getMaxVelocity() + getCapacity() + 0.10 * getPurchaseCost();
//        setVehicleTax(tax);
//    }
//
//    @Override
//    public String getVehicleType() {
//        return "Petrol";
//    }
//}
