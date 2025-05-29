package com.example.demo.backgohost.model;

import jakarta.persistence.Entity;

@Entity
public class FeedbackModel extends ClientModel {

    private int nuQuantidadeEstrelas;

    public int getNuQuantidadeEstrelas() {
        return nuQuantidadeEstrelas;
    }

    public void setNuQuantidadeEstrelas(int nuQuantidadeEstrelas) {
        this.nuQuantidadeEstrelas = nuQuantidadeEstrelas;
    }
}
