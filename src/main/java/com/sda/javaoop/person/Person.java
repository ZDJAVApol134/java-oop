package com.sda.javaoop.person;

import com.sda.javaoop.enums.UserRole;

import java.util.Objects;

public class Person {

    private int age;
    private String firstName;
    private String lastName;
    private Gender gender;

    public Person() {

    }

    public Person(String firstName, String lastName, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @SuppressWarnings("all")
    public boolean isRetired() {
        if (Gender.MALE.equals(gender)) {
            return age > 67;
        } else if (Gender.FEMALE.equals(gender)) {
            return age > 65;
        } else {
        }
        return false;
    }


    @Override
    public String toString() {
        return "Person: " + "age: " + age + " firstName: " + firstName
                + " lastName: " + lastName + " gender: " + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName)
                && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, lastName, gender);
    }
}
