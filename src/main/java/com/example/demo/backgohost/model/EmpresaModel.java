package com.example.demo.backgohost.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class EmpresaModel{

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nmUsuarioAdmin = "admin";

    private String nuSenhaAdmin = "admin";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNmUsuarioAdmin() {
        return nmUsuarioAdmin;
    }

    public void setNmUsuarioAdmin(String nmUsuarioAdmin) {
        this.nmUsuarioAdmin = nmUsuarioAdmin;
    }

    public String getNuSenhaAdmin() {
        return nuSenhaAdmin;
    }

    public void setNuSenhaAdmin(String nuSenhaAdmin) {
        this.nuSenhaAdmin = nuSenhaAdmin;
    }
}
