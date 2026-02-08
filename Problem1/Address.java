public Class Address {
    prviatte string street;
    private string city;
    private string state;
    private string zipCode;

    public toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}