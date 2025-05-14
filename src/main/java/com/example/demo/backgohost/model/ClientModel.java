package com.example.demo.backgohost.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TBCLIENTE")
public class ClientModel extends UsuarioModel {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
