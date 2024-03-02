package ru.rizvanova.api.finalHW;

import java.util.*;

public class Phonebook {
    public static void main(String[] args) {
        HashMap<String, Person> phonebook = new HashMap<>();

        addContact(phonebook, "John", "123456789", "987654321");
        addContact(phonebook, "Alice", "555111222");
        addContact(phonebook, "Bob", "999000111", "111222333", "444555666");
        addContact(phonebook, "John", "555666777");
        addContact(phonebook, "John", "132666777", "223300155");
        addContact(phonebook, "Charlie", "111666777", "999000111");

        List<Person> sortedPhonebook = new ArrayList<>(phonebook.values());
        sortedPhonebook.sort(new PersonComparator());

        printSortedContacts(sortedPhonebook);
    }

    private static void addContact(HashMap<String, Person> phonebook, String name, String... phoneNumbers) {
        Person person = phonebook.getOrDefault(name, new Person(name));
        Collections.addAll(person.getPhoneNumbers(), phoneNumbers);
        phonebook.put(name, person);
    }

    private static void printSortedContacts(List<Person> sortedPhonebook) {
        for (Person person : sortedPhonebook) {
            System.out.println(person);
        }
    }
}