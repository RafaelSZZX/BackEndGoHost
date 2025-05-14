package com.example.demo.backgohost.model;

import jakarta.persistence.*;

import java.lang.reflect.Type;

@Entity
@Table(name = "TBIMOVEL")
public class ImovelModel {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String dsImovel;

    private String nmEndereco;

    private String nmTipo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDsImovel() {
        return dsImovel;
    }

    public void setDsImovel(String dsImovel) {
        this.dsImovel = dsImovel;
    }

    public String getNmEndereco() {
        return nmEndereco;
    }

    public void setNmEndereco(String nmEndereco) {
        this.nmEndereco = nmEndereco;
    }

    public String getNmTipo() {
        return nmTipo;
    }

    public void setNmTipo(String nmTipo) {
        this.nmTipo = nmTipo;
    }
}
