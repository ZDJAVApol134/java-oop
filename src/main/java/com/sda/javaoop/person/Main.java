package com.sda.javaoop.person;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("Jan");
        person1.setLastName("Kowlski");
        person1.setAge(30);
        person1.setGender(Gender.MALE);

        Person person2 = new Person();
        person2.setFirstName("Jan");
        person2.setLastName("Kowlski");
        person2.setAge(30);
        person2.setGender(Gender.MALE);
        Person person3 = new Person("Kasia", "Kowalska", 28, Gender.FEMALE);

        System.out.println("person1 equals person2 = " + person1.equals(person2));
        System.out.println("person2 equals person3 = " + person2.equals(person3));
        System.out.println("person1 equals person3 = " + person1.equals(person3));
        System.out.println();
        System.out.println("person1 hashcode = " + person1.hashCode());
        System.out.println("person2 hashcode = " + person2.hashCode());
        System.out.println("person3 hashcode = " + person3.hashCode());

    }
}
