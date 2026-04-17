package com.zapataluis.tiendapoo.correcion;

public class Producto {

    private int id;
    private String codigo;
    private String nombre;
    private String talla;
    private String color;
    private double precio;
    private int stock;

    public Producto(int id, String codigo, String nombre, String talla, String color, double precio, int stock) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTalla() { return talla; }
    public void setTalla(String talla) { this.talla = talla; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    
   
    
}