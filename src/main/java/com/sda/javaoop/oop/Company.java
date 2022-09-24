package com.sda.javaoop.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {

    private long id;
    private String name;
    private Address address;
    private List<Employee> employees;

    public Company(long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.employees = new ArrayList<>();
        System.out.println("Company class - Creating object using 3 ARGS constructor.");
    }

    public long getId() {
        System.out.println("Company class - Getting id: " + id);
        return id;
    }

    public void setId(long id) {
        System.out.println("Company class - Setting id to: " + id);
        this.id = id;
    }

    public String getName() {
        System.out.println("Company class - Getting name: " + name);
        return name;
    }

    public void setName(String name) {
        System.out.println("Company class - Setting name to: " + name);
        this.name = name;
    }

    public Address getAddress() {
        System.out.println("Company class - Getting address: " + address);
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Company class - Setting address to: " + address);
        this.address = address;
    }

    public List<Employee> getEmployees() {
        System.out.println("Company class - Getting employees: " + employees);
        return new ArrayList<>(employees);
    }

    public void setEmployees(List<Employee> employees) {
        System.out.println("Company class - Setting employees to: " + employees);
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        if (!employees.isEmpty()) {
            System.out.println("Current employees list: ");
            for (int i = 0; i < employees.size(); i++) {
                System.out.println(i + 1 + ". - " + employees.get(i));
            }
        }else {
            System.out.println("Current employees list: " + employees);
        }

        System.out.println("Company class - adding employee to list: " + employee);
        this.employees.add(employee);

        System.out.println("Updated employees list: ");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(i + 1 + ". - " + employees.get(i));
        }
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Company class - Compering objects with equals() method.\nObject A: "
                + this + "\nObject B: " + o);
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return id == company.id
                && Objects.equals(name, company.name)
                && Objects.equals(address, company.address);
    }

    @Override
    public int hashCode() {
        System.out.println("Company class - Running hashcode method.");
        return Objects.hash(id, name, address);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", employees=" + employees +
                '}';
    }
}
