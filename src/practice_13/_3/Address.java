package practice_13._3;

public class Address {
    private String country;
    private String district;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;

    Address(String s, String separator) {
        String[] info;
        info = s.split(separator);
        this.country = info[0];
        this.district = info[1];
        this.city = info[2];
        this.street = info[3];
        this.house= info[4];
        this.building = info[5];
        this.flat = info[6];

    }

    public String getCountry() { return country; }

    public String getDistrict() { return district; }

    public String getCity() { return city; }

    public String getStreet() { return street; }

    public String getHouse() { return house; }

    public String getBuilding() { return building; }

    public String getFlat() { return flat; }
}
