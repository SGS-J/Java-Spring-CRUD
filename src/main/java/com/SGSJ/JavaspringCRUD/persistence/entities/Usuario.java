package com.SGSJ.JavaspringCRUD.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String Nombre;
    private String Contraseña;
    private Integer Edad;
    private String Correo;

    public Usuario(Long idUsuario, String nombre, String contraseña, Integer edad) {
        this.idUsuario = idUsuario;
        Nombre = nombre;
        Contraseña = contraseña;
        Edad = edad;
    }

    public Usuario(Long idUsuario, String nombre, String contraseña, Integer edad, String correo) {
        this.idUsuario = idUsuario;
        Nombre = nombre;
        Contraseña = contraseña;
        Edad = edad;
        Correo = correo;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
}


