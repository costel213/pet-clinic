package com.costelmitrea.petclinic.model;

public class Person extends BaseEntity {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLstName(String lastName) {
        this.lastName = lastName;
    }
}
