package com.example.demo.backgohost.dto;

import jakarta.validation.constraints.NotNull;

public record FeedbackRecordDto(@NotNull int id,
                                @NotNull int nuQuantidadeEstrelas) {
}
