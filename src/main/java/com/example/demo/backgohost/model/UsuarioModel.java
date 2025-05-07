package com.example.demo.backgohost.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class UsuarioModel {

    //Atributos da tabela Usuario
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    public String nmNome;

    protected String nuCpf;

    private String nmEmail;

    private String nuTelefone;

    private Date nuDataNascimento;

    protected String nmSenha;

    //Metodos Getter and Setter
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNmNome() {
        return nmNome;
    }

    public void setNmNome(String nmNome) {
        this.nmNome = nmNome;
    }

    public String getNuCpf() {
        return nuCpf;
    }

    public void setNuCpf(String nuCpf) {
        this.nuCpf = nuCpf;
    }

    public String getNmEmail() {
        return nmEmail;
    }

    public void setNmEmail(String nmEmail) {
        this.nmEmail = nmEmail;
    }

    public String getNuTelefone() {
        return nuTelefone;
    }

    public void setNuTelefone(String nuTelefone) {
        this.nuTelefone = nuTelefone;
    }

    public Date getNuDataNascimento() {
        return nuDataNascimento;
    }

    public void setNuDataNascimento(Date nuDataNascimento) {
        this.nuDataNascimento = nuDataNascimento;
    }

    public String getNmSenha() {
        return nmSenha;
    }

    public void setNmSenha(String nmSenha) {
        this.nmSenha = nmSenha;
    }
}
