package com.zoracorp.model;

import java.io.Serializable;

public class User implements Serializable {
    private String firstname;
    private String phone;

    public User() {
    }

    public User(String firstname, String phone) {
        this.firstname = firstname;
        this.phone = phone;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
