public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}