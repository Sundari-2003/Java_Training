package taxapp.models;

public abstract class Vehicle {
    private final String registrationNumber;
    private final String brand;
    private final int maxVelocity;
    private final int capacity;
    private final double purchaseCost;
    private double vehicleTax;

    public Vehicle(String registrationNumber, String brand, int maxVelocity, int capacity, double purchaseCost) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.maxVelocity = maxVelocity;
        this.capacity = capacity;
        this.purchaseCost = purchaseCost;
        this.vehicleTax = 0;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPurchaseCost() {
        return purchaseCost;
    }

    public double getVehicleTax() {
        return vehicleTax;
    }

    public void setVehicleTax(double vehicleTax) {
        this.vehicleTax = vehicleTax;
    }

    // Abstract method to identify type string
    public abstract String getVehicleTypeString();

    @Override
    public String toString() {
        return String.format("%-16s %-10s %-14d %-13d %-13s %-14.2f %-11.2f",
                registrationNumber, brand, maxVelocity, capacity, getVehicleTypeString(), purchaseCost, vehicleTax);
    }
}


//package taxapp.models;
//
//public abstract class Vehicle {
//    private String registrationNumber;
//    private String brand;
//    private double maxVelocity;
//    private int capacity;
//    private double purchaseCost;
//    private double vehicleTax;
//
//    public Vehicle(String registrationNumber, String brand, double maxVelocity, int capacity, double purchaseCost) {
//        this.registrationNumber = registrationNumber;
//        this.brand = brand;
//        this.maxVelocity = maxVelocity;
//        this.capacity = capacity;
//        this.purchaseCost = purchaseCost;
//        this.vehicleTax = 0.0;
//    }
//
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public double getMaxVelocity() {
//        return maxVelocity;
//    }
//
//    public int getCapacity() {
//        return capacity;
//    }
//
//    public double getPurchaseCost() {
//        return purchaseCost;
//    }
//
//    public double getVehicleTax() {
//        return vehicleTax;
//    }
//
//    public void setVehicleTax(double vehicleTax) {
//        this.vehicleTax = vehicleTax;
//    }
//
//    // Abstract method for calculating tax, to be implemented by subclasses
//    public abstract void calculateTax();
//
//    // Get type of vehicle as String (Petrol, Diesel, CNG/LPG)
//    public abstract String getVehicleType();
//
//    @Override
//    public String toString() {
//        return String.format("%-16s %-10s %-13.2f %-14d %-12s %-14.2f %-12.2f",
//                registrationNumber, brand, maxVelocity, capacity, getVehicleType(), purchaseCost, vehicleTax);
//    }
//}
