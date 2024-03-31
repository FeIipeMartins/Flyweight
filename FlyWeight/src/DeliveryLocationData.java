// DeliveryLocationData.java
public class DeliveryLocationData {
    private final String street;
    private final String city;

    public DeliveryLocationData(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // Getters para street e city
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
}
