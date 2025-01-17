package com.crud.b7assessoria.dto;

public class AuditDetailDTO {

    private Long id;
    private String field;
    private String oldValue;
    private String newValue;

    public AuditDetailDTO() {
    }

    public AuditDetailDTO(Long id, String field, String oldValue, String newValue) {
        this.id = id;
        this.field = field;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }
}
