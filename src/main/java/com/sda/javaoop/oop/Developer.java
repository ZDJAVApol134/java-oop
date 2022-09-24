package com.sda.javaoop.oop;

public class Developer extends Employee {

    public Developer(int id, String name, String surname,
                     String pesel, Address address, Department department) {

        super(id, name, surname, pesel, address, department, EmployeeRole.JAVA_DEVELOPER);
        System.out.println("Developer class - ALL ARGS constructor invoked.");
    }

    @Override
    public void printEmployeeRole() {
        System.out.println("Developer class - Employee role is: " + super.getEmployeeRole());
    }

    @Override
    public boolean doWork() {
        System.out.println("Developer class - doWork() method invoked");
        return false;
    }
}
