package com.sda.javaoop.oop;

import java.util.Objects;

public abstract class Employee implements Workable {

    private int id;
    private String name;
    private String surname;
    private String pesel;
    private Address address;
    private Department department;
    private EmployeeRole employeeRole;

    public Employee(int id, String name, String surname,
                    String pesel, Address address,
                    Department department, EmployeeRole employeeRole) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.address = address;
        this.department = department;
        this.employeeRole = employeeRole;
        System.out.println("Employee class - ALL ARGS constructor invoked.");
    }

    public abstract void printEmployeeRole();

    public long getId() {
        System.out.println("Employee class - Getting id: " + id);
        return id;
    }

    public void setId(int id) {
        System.out.println("Employee class - Setting id to: " + id);
        this.id = id;
    }

    public String getName() {
        System.out.println("Employee class - Getting name: " + name);
        return name;
    }

    public void setName(String name) {
        System.out.println("Employee class - Setting name to: " + name);
        this.name = name;
    }

    public String getSurname() {
        System.out.println("Employee class - Getting name: " + surname);
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Employee class - Setting surname to: " + surname);
        this.surname = surname;
    }

    public String getPesel() {
        System.out.println("Employee class - Getting pesel: " + pesel);
        return pesel;
    }

    public void setPesel(String pesel) {
        System.out.println("Employee class - Setting pesel to: " + pesel);
        this.pesel = pesel;
    }

    public Address getAddress() {
        System.out.println("Employee class - Getting address: " + address);
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Employee class - Setting address to: " + address);
        this.address = address;
    }

    public Department getDepartment() {
        System.out.println("Employee class - Getting department: " + department);
        return department;
    }

    public void setDepartment(Department department) {
        System.out.println("Employee class - Setting department to: " + department);
        this.department = department;
    }

    public EmployeeRole getEmployeeRole() {
        System.out.println("Employee class - Getting employeeRole: " + employeeRole);
        return employeeRole;
    }

    public void setEmployeeRole(EmployeeRole employeeRole) {
        System.out.println("Employee class - Setting employeeRole to: " + employeeRole);
        this.employeeRole = employeeRole;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Employee class - Compering objects with equals() method.\nObject A: "
                + this + "\nObject B: " + o);
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id
                && Objects.equals(name, employee.name)
                && Objects.equals(surname, employee.surname)
                && Objects.equals(pesel, employee.pesel)
                && Objects.equals(address, employee.address)
                && department == employee.department;
    }

    @Override
    public int hashCode() {
        System.out.println("Employee class - Running hashcode() method.");
        return Objects.hash(id, name, surname, pesel, address, department);
    }

    @Override
    public String toString() {
        System.out.println("Employee class - toString() method invoked.");
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", address=" + address +
                ", department=" + department +
                '}';
    }
}
