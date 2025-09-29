package BuilderDesignPattern;

public class Company {
    private int id;
    private String name;
    private String location;
    private String city;
    private int pincode;

    public Company(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Company(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.location = builder.location;
    }

    public static class Builder {
        private int id;
        private String name;
        private String location;

        // optional field

        private String city;
        private int pincode;

        public void setCity(String city) {
            this.city = city;
        }

        

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

}