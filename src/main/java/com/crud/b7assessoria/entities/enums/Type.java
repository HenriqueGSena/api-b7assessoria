package com.crud.b7assessoria.entities.enums;

public enum Type {

    Normal("normal"),
    Special("special"),
    Custom("custom");

    private String Type;

    Type(String type) {
        this.Type = type;
    }

    public String getType() {
        return this.Type;
    }
}
