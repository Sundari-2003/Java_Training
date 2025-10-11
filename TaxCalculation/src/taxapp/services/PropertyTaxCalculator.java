package taxapp.services;

import taxapp.models.Property;

public class PropertyTaxCalculator implements TaxCalculator<Property> {

    @Override
    public double calculateTax(Property property) {
        // Simple example formula for property tax calculation:
        double baseTax = property.getBaseValue() * 0.01; // 1% of base value

        // Age depreciation - 0.5% per year, capped at 50%
        double depreciation = Math.min(property.getAge() * 0.005, 0.5);

        double locationMultiplier = property.isInCity() ? 1.5 : 1.0;

        double tax = baseTax * (1 - depreciation) * locationMultiplier * property.getBuiltUpArea();
        return tax;
    }
}


//package taxapp.services;
//
//import taxapp.models.Property;
//
//public class PropertyTaxCalculator implements TaxCalculator<Property> {
//
//    @Override
//    public void calculateTax(Property property) {
//        double builtUpArea = property.getBuiltUpArea();
//        double baseValue = property.getBaseValue();
//        int age = property.getAge();
//        boolean inCity = property.isInCity();
//
//        double tax;
//        if (inCity) {
//            tax = (builtUpArea * age * baseValue) + (0.5 * builtUpArea);
//        } else {
//            tax = builtUpArea * age * baseValue;
//        }
//
//        property.setPropertyTax(tax);
//    }
//}
