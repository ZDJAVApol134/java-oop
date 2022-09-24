package com.sda.javaoop.oop;

public enum Department {

    HR(1),
    BRANDING(2),
    SALES(3),
    MARKETING(4),
    ADMINISTRATION(5),
    HEAD(6),
    IT(7);

    private final int departmentId;

    Department(int departmentId) {
        this.departmentId = departmentId;
        System.out.printf("Department enum - Creating instance %s with departmentId: %d\n", this.name(), departmentId);
    }

    public int getDepartmentId() {
        System.out.println("Department enum - Getting departmentId: " + departmentId);
        return departmentId;
    }

    @Override
    public String toString() {
        return "Department: " + this.name() + " departmentId=" + departmentId;
    }
}
