package com.example.demo.backgohost.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ImovelRecordDto(@NotNull int id,
                              @NotBlank String dsImovel,
                              @NotBlank String nmEndereco,
                              @NotBlank String nmTipo) {
}
