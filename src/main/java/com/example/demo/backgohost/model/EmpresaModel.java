package com.example.demo.backgohost.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TBEMPRESA")
public class EmpresaModel {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpresa;

    private String nmEmpresa;

    private String nuCnpj;

    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNuCnpj() {
        return nuCnpj;
    }

    public void setNuCnpj(String nuCnpj) {
        this.nuCnpj = nuCnpj;
    }

    public String getNmEmpresa() {
        return nmEmpresa;
    }

    public void setNmEmpresa(String nmEmpresa) {
        this.nmEmpresa = nmEmpresa;
    }
}
