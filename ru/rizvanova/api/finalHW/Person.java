package ru.rizvanova.api.finalHW;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<String> phoneNumbers;

    public Person(String name) {
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    @Override
    public String toString() {
        return name + " -> " + phoneNumbers;
    }
}