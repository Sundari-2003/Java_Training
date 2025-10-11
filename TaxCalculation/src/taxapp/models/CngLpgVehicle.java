package taxapp.models;

public class CngLpgVehicle extends Vehicle {
    public CngLpgVehicle(String registrationNumber, String brand, int maxVelocity, int capacity, double purchaseCost) {
        super(registrationNumber, brand, maxVelocity, capacity, purchaseCost);
    }

    @Override
    public String getVehicleTypeString() {
        return "CNG/LPG";
    }
}

//package taxapp.models;
//
//public class CngLpgVehicle extends Vehicle {
//
//    public CngLpgVehicle(String registrationNumber, String brand, double maxVelocity, int capacity, double purchaseCost) {
//        super(registrationNumber, brand, maxVelocity, capacity, purchaseCost);
//    }
//
//    @Override
//    public void calculateTax() {
//        double tax = getMaxVelocity() + getCapacity() + 0.12 * getPurchaseCost();
//        setVehicleTax(tax);
//    }
//
//    @Override
//    public String getVehicleType() {
//        return "CNG/LPG";
//    }
//}
