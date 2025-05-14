package com.example.demo.backgohost.model;


import jakarta.persistence.*;

import java.util.Date;

@MappedSuperclass
public abstract class UsuarioModel {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nmUsuario;

    private String nuCpf;

    private String nuEmail;

    private String nuSenha;

    private Date dtNascimento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNmUsuario() {
        return nmUsuario;
    }

    public void setNmUsuario(String nmUsuario) {
        this.nmUsuario = nmUsuario;
    }

    public String getNuCpf() {
        return nuCpf;
    }

    public void setNuCpf(String nuCpf) {
        this.nuCpf = nuCpf;
    }

    public String getNuEmail() {
        return nuEmail;
    }

    public void setNuEmail(String nuEmail) {
        this.nuEmail = nuEmail;
    }

    public String getNuSenha() {
        return nuSenha;
    }

    public void setNuSenha(String nuSenha) {
        this.nuSenha = nuSenha;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
}
