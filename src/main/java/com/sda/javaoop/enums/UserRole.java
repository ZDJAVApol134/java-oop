package com.sda.javaoop.enums;

public enum UserRole {
    ADMIN(1),
    USER(2),
    MODERATOR(3);
    private final int id;


    UserRole(int id) {
        this.id = id;
    }
}
