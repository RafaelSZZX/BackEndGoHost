package com.example.demo.backgohost.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record UsuarioRecordDto(@NotNull int idUsuario,
                               @NotBlank String nmNome,
                               @NotNull String nuCpf,
                               @NotBlank String nmEmail,
                               @NotBlank String nuSenha,
                               @NotNull String nuTelefone,
                               @NotBlank Date nuDataNascimento) {
}
