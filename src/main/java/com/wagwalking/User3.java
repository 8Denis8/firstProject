package com.wagwalking;

public class User3 extends ParentalUser{

    private String address;
    private String apt;
    private String citi;
    private String state;
    private String zipcode;

    public User3(String email, String password, String firstName, String lastName, String cellFon, String address, String apt, String city, String state, String zipcode) {
        super(email, password, firstName, lastName, cellFon);
        this.address = address;
        this.apt = apt;
        this.citi = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public String getApt() {
        return apt;
    }

    public String getCiti() {
        return citi;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }
}
