package com.sda.javaoop.oop;


public class TeamLeader extends Employee {


    public TeamLeader(int id, String name, String surname, String pesel,
                      Address address, Department department) {

        super(id, name, surname, pesel, address,
                department, EmployeeRole.TEAM_LEADER);
        System.out.println("TeamLeader class - ALL ARGS constructor invoked.");
    }

    @Override
    public void printEmployeeRole() {
        System.out.println("TeamLeader class - Employee role is: " + super.getEmployeeRole());
    }

    @Override
    public boolean doWork() {
        System.out.println("TeamLeader class - Running doWork() method.");
        return false;
    }
}
