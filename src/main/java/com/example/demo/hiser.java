package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class hiser {

    public String getGreeting() {
        return "Hello From Dinesh";
    }

    public String getGreetingWithName(String name) {
        return "Hello " + name + "!";
    }

    public String getGreetingWithUser(hidata user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }

    public String getGreetingWithNames(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
