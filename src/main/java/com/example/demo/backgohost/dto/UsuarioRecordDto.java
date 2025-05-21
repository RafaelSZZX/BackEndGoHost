package com.example.demo.backgohost.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record UsuarioRecordDto(@NotNull int id,
                               @NotBlank String nmUsuario,
                               @NotBlank String nuCpf,
                               @NotBlank String nuEmail,
                               @NotBlank String nuSenha,
                               @NotBlank Date dtNascimento) {
}
