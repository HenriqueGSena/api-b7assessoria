package com.crud.b7assessoria.dto;

import com.crud.b7assessoria.entities.enums.Role;

public record RegisterDTO(String name, String password, Role role) {
}
