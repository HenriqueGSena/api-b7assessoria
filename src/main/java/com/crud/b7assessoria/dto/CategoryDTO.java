package com.crud.b7assessoria.dto;

import com.crud.b7assessoria.entities.enums.Type;

public class CategoryDTO {

    private Long id;
    private String name;
    private String active;
    private Type type;

    public CategoryDTO() {
    }

    public CategoryDTO(Long id, String name, String active, Type type) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
