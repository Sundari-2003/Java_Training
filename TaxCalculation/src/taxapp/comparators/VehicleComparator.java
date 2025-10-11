package taxapp.comparators;

import taxapp.models.Vehicle;

import java.util.Comparator;

public class VehicleComparator implements Comparator<Vehicle> {

    public enum SortField {
        REGISTRATION_NO,
        VEHICLE_TAX
    }

    private SortField sortField;

    public VehicleComparator(SortField sortField) {
        this.sortField = sortField;
    }

    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        switch (sortField) {
            case REGISTRATION_NO:
                return v1.getRegistrationNumber().compareTo(v2.getRegistrationNumber());
            case VEHICLE_TAX:
                return Double.compare(v1.getVehicleTax(), v2.getVehicleTax());
            default:
                return 0;
        }
    }
}
