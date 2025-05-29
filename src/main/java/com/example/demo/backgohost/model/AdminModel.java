package com.example.demo.backgohost.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "TBADMIN")
public class AdminModel extends EmpresaModel{

}
