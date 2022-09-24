package com.sda.javaoop.oop;

import java.util.Objects;

public class Address {

    private String street;
    private String city;
    private String postcode;
    public Address() {
        System.out.println("Address class - Creating object with NO ARGS constructor.");
    }

    public Address(String street, String city, String postcode) {
        System.out.println("Address class - Creating object with ALL ARGS constructor");
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    public String getStreet() {
        System.out.println("Address class - Getting street: " + street);
        return street;
    }

    public void setStreet(String street) {
        System.out.println("Address class - Setting street to: " + street);
        this.street = street;
    }

    public String getCity() {
        System.out.println("Address class - Getting city: " + city);
        return city;
    }

    public void setCity(String city) {
        System.out.println("Address class - Setting city to: " + city);
        this.city = city;
    }

    public String getPostcode() {
        System.out.println("Address class - Getting postcode: "+ postcode);
        return postcode;
    }

    public void setPostcode(String postcode) {
        System.out.println("Address class - Setting postcode to: " + postcode);
        this.postcode = postcode;
    }


    @Override
    public boolean equals(Object o) {
        System.out.println("Address class - Compering objects with equals() method.\nObject A: "
                + this + "\nObject B: " + o);
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street)
                && Objects.equals(city, address.city)
                && Objects.equals(postcode, address.postcode);
    }

    @Override
    public int hashCode() {
        System.out.println("Address class - Running hashcode() method.");
        return Objects.hash(street, city, postcode);
    }

    @Override
    public String toString() {
        System.out.println("Address class - toString() method invoked.");
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
