package com.crud.b7assessoria.entities.enums;

public enum Role {

    ADMIN("admin"),
    STOCKIST("stockist");

    private String role;
    Role(String role) {
        this.role = role;
    }
    public String getRole() {
        return this.role;
    }
}
