package com.zoracorp.model;

public class UserDTO {
    private String firstname;
    private String phone;


    public UserDTO() {
    }

    public UserDTO(String firstname, String phone) {
        this.firstname = firstname;
        this.phone = phone;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "firstname='" + firstname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
