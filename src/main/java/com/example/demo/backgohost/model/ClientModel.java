package com.example.demo.backgohost.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "TBCLIENTE")
public class ClientModel extends UsuarioModel {

}
