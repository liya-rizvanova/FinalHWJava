package ru.rizvanova.api.finalHW;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        int phoneCountComparison = Integer.compare(p2.getPhoneNumbers().size(), p1.getPhoneNumbers().size());

        if (phoneCountComparison != 0) {
            return phoneCountComparison;
        }

        return p1.getName().compareTo(p2.getName());
    }
}