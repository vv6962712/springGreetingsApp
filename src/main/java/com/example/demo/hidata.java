package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class hidata {

    private String firstName;
    private String lastName;

    // Default constructor
    public hidata() {}

    // Parameterized constructor
    public hidata(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
