package taxapp.services;

import taxapp.models.Property;
import taxapp.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class StorageService {

    private static StorageService instance;

    private final List<Property> properties;
    private final List<Vehicle> vehicles;

    private int propertyIdCounter = 1000;  // starting ID for properties

    private StorageService() {
        properties = new ArrayList<>();
        vehicles = new ArrayList<>();
    }

    public static StorageService getInstance() {
        if (instance == null) {
            instance = new StorageService();
        }
        return instance;
    }

    // Property related methods
    public synchronized int generatePropertyId() {
        return ++propertyIdCounter;
    }

    public synchronized void addProperty(Property property) {
        properties.add(property);
    }

    public List<Property> getProperties() {
        return new ArrayList<>(properties);
    }

    public Property getPropertyById(int id) {
        return properties.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Vehicle related methods
    public synchronized void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return new ArrayList<>(vehicles);
    }

    public Vehicle getVehicleByRegistration(String regNo) {
        return vehicles.stream()
                .filter(v -> v.getRegistrationNumber().equalsIgnoreCase(regNo))
                .findFirst()
                .orElse(null);
    }
}


//package taxapp.services;
//
//import taxapp.models.Property;
//import taxapp.models.Vehicle;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class StorageService {
//
//    private static StorageService instance;
//
//    private final List<Property> properties;
//    private final List<Vehicle> vehicles;
//
//    private int propertyIdCounter = 1;
//
//    private StorageService() {
//        properties = new ArrayList<>();
//        vehicles = new ArrayList<>();
//    }
//
//    public static StorageService getInstance() {
//        if (instance == null) {
//            instance = new StorageService();
//        }
//        return instance;
//    }
//
//    // Property methods
//    public int generatePropertyId() {
//        return propertyIdCounter++;
//    }
//
//    public void addProperty(Property property) {
//        properties.add(property);
//    }
//
//    public List<Property> getProperties() {
//        return properties;
//    }
//
//    public Property getPropertyById(int id) {
//        for (Property property : properties) {
//            if (property.getId() == id) {
//                return property;
//            }
//        }
//        return null;
//    }
//
//    // Vehicle methods
//    public void addVehicle(Vehicle vehicle) {
//        vehicles.add(vehicle);
//    }
//
//    public List<Vehicle> getVehicles() {
//        return vehicles;
//    }
//
//    public Vehicle getVehicleByRegistrationNumber(String regNo) {
//        for (Vehicle vehicle : vehicles) {
//            if (vehicle.getRegistrationNumber().equals(regNo)) {
//                return vehicle;
//            }
//        }
//        return null;
//    }
//}
//
//
//
//
//
//
//
////package taxapp.services;
//
////import taxapp.models.Property;
////import taxapp.models.Vehicle;
////
////import java.util.*;
////
////public class StorageService {
////    private final Map<Integer, Property> properties = new HashMap<>();
////    private final Map<String, Vehicle> vehicles = new HashMap<>();
////
////    // Property methods
////    public void addProperty(Property property) {
////        properties.put(property.getId(), property);
////    }
////
////    public Property getPropertyById(int id) {
////        return properties.get(id);
////    }
////
////    public Collection<Property> getAllProperties() {
////        return properties.values();
////    }
////
////    public boolean isPropertyExists(int id) {
////        return properties.containsKey(id);
////    }
////
////    public int getPropertyCount() {
////        return properties.size();
////    }
////
////    public double getTotalPropertyTax() {
////        return properties.values().stream().mapToDouble(Property::getPropertyTax).sum();
////    }
////
////    // Vehicle methods
////    public void addVehicle(Vehicle vehicle) {
////        vehicles.put(vehicle.getRegistrationNumber(), vehicle);
////    }
////
////    public Vehicle getVehicleByRegistrationNumber(String regNo) {
////        return vehicles.get(regNo);
////    }
////
////    public Collection<Vehicle> getAllVehicles() {
////        return vehicles.values();
////    }
////
////    public boolean isVehicleExists(String regNo) {
////        return vehicles.containsKey(regNo);
////    }
////
////    public int getVehicleCount() {
////        return vehicles.size();
////    }
////
////    public double getTotalVehicleTax() {
////        return vehicles.values().stream().mapToDouble(Vehicle::getVehicleTax).sum();
////    }
////
////    public double getTotalTax() {
////        return getTotalPropertyTax() + getTotalVehicleTax();
////    }
////}
