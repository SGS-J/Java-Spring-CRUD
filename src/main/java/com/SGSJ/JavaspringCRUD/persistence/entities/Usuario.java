package com.SGSJ.JavaspringCRUD.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdUsuario;
    private String Nombre;
    private String Contraseña;
    private int Edad;
    private String Correo;

    public Usuario(long idUsuario, String nombre, String contraseña, int edad) {
        this.IdUsuario = idUsuario;
        Nombre = nombre;
        Contraseña = contraseña;
        Edad = edad;
    }

    public Usuario(long idUsuario, String nombre, String contraseña, int edad, String correo) {
        this.IdUsuario = idUsuario;
        Nombre = nombre;
        Contraseña = contraseña;
        Edad = edad;
        Correo = correo;
    }

    public long getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.IdUsuario = idUsuario;
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


