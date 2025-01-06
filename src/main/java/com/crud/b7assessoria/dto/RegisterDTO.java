package com.crud.b7assessoria.dto;

import com.crud.b7assessoria.entities.enums.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegisterDTO(
        @NotBlank String name,
        @NotBlank String password,
        @NotNull Role role
) {}

