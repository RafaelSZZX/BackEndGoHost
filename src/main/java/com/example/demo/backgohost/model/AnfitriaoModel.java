package com.example.demo.backgohost.model;

import jakarta.persistence.*;
import org.apache.juli.logging.Log;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "TBANFITRIAO")
public class AnfitriaoModel extends UsuarioModel {

}
