package taxapp.models;

public class Property {
    private final int id;
    private final double builtUpArea;
    private final double baseValue;
    private final int age;
    private final boolean inCity;
    private double propertyTax;

    public Property(int id, double builtUpArea, double baseValue, int age, boolean inCity) {
        this.id = id;
        this.builtUpArea = builtUpArea;
        this.baseValue = baseValue;
        this.age = age;
        this.inCity = inCity;
        this.propertyTax = 0;
    }

    public int getId() {
        return id;
    }

    public double getBuiltUpArea() {
        return builtUpArea;
    }

    public double getBaseValue() {
        return baseValue;
    }

    public int getAge() {
        return age;
    }

    public boolean isInCity() {
        return inCity;
    }

    public double getPropertyTax() {
        return propertyTax;
    }

    public void setPropertyTax(double propertyTax) {
        this.propertyTax = propertyTax;
    }

    @Override
    public String toString() {
        return String.format("%-8d %-15.2f %-12.2f %-12d %-8s %-12.2f",
                id, builtUpArea, baseValue, age, (inCity ? "Y" : "N"), propertyTax);
    }
}


//package taxapp.models;
//
//public class Property {
//    private int id;
//    private double builtUpArea;
//    private double baseValue;
//    private int age;
//    private boolean inCity;
//    private double propertyTax;
//
//    public Property(int id, double builtUpArea, double baseValue, int age, boolean inCity) {
//        this.id = id;
//        this.builtUpArea = builtUpArea;
//        this.baseValue = baseValue;
//        this.age = age;
//        this.inCity = inCity;
//        this.propertyTax = 0.0;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public double getBuiltUpArea() {
//        return builtUpArea;
//    }
//
//    public double getBaseValue() {
//        return baseValue;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public boolean isInCity() {
//        return inCity;
//    }
//
//    public double getPropertyTax() {
//        return propertyTax;
//    }
//
////    public void setPropertyTax(double propertyTax) {
////        this.propertyTax = propertyTax;
////    }
//    public void setPropertyTax(double propertyTax) {
//        this.propertyTax = propertyTax;
//    }
//
//
//    @Override
//    public String toString() {
//        return String.format("%-8d %-15.2f %-12.2f %-12d %-8s %-12.2f",
//                id, builtUpArea, baseValue, age, inCity ? "Y" : "N", propertyTax);
//    }
//}
