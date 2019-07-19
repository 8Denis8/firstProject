package com.wagwalking.user;

public abstract class ParentalUser {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String cellFon;

    public ParentalUser(String email, String password, String firstName, String lastName, String cellFon) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellFon = cellFon;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCellFon() {
        return cellFon;
    }
}
