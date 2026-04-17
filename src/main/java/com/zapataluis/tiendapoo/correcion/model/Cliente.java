package com.zapataluis.tiendapoo.correcion.model;

public class Cliente {
   
    private int id;
    private String nombre;
    private int edad;
    private String correo;

    public Cliente(int id, String nombre, int edad,String correo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.correo=correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int  getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
 
    
  
    
}

