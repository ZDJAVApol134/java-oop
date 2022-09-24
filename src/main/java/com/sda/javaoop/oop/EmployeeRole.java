package com.sda.javaoop.oop;

public enum EmployeeRole {
    TEAM_LEADER, JAVA_DEVELOPER;

    EmployeeRole() {
        System.out.printf("EmployeeRole enum - Creating instance %s using NO ARGS constructor.\n", this.name());
    }
}