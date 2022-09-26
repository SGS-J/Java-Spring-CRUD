package com.SGSJ.JavaspringCRUD.model.User;

import net.bytebuddy.implementation.bind.annotation.Default;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String Nombre;
    private String Contraseña;
    private int Edad;
    private String Correo;

    public Usuario() {

    }

    public Usuario(Long idUsuario, String Nombre, String contraseña, int edad) {
        this.idUsuario = idUsuario;
        this.Nombre = Nombre;
        Contraseña = contraseña;
        Edad = edad;
    }

    public Usuario(Long idUsuario, String Nombre, String contraseña, int edad, String correo) {
        this.idUsuario = idUsuario;
        this.Nombre = Nombre;
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

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
}


