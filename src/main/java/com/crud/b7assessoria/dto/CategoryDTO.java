package com.crud.b7assessoria.dto;

import com.crud.b7assessoria.entities.Category;
import com.crud.b7assessoria.entities.enums.Type;

public class CategoryDTO {

    private Long id;
    private String name;
    private Boolean active;
    private Type type;

    public CategoryDTO() {
    }

    public CategoryDTO(Long id, String name, Boolean active, Type type) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.type = type;
    }

    public CategoryDTO(Category category) {
        this.id = category.getId();
        this.name = category.getName();
        this.active = category.getActive();
        this.type = category.getType();
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
