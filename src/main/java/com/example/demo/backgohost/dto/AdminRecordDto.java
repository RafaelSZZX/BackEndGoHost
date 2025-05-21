package com.example.demo.backgohost.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AdminRecordDto(@NotNull int id,
                             @NotBlank String nmUsuarioAdmin,
                             @NotBlank String nuSenhaAdmin) {
}
