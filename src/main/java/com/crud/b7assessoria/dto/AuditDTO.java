package com.crud.b7assessoria.dto;

import java.time.LocalDateTime;

public class AuditDTO {

    private Long id;
    private String name;
    private String action;
    private Long userId;
    private LocalDateTime dateTime;

    public AuditDTO() {
    }

    public AuditDTO(Long id, String name, String action, Long userId, LocalDateTime dateTime) {
        this.id = id;
        this.name = name;
        this.action = action;
        this.userId = userId;
        this.dateTime = dateTime;
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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
