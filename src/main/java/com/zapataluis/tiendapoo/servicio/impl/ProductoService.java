/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zapataluis.tiendapoo.servicio.impl;

import com.zapataluis.tiendapoo.correcion.model.Producto;
import com.zapataluis.tiendapoo.servicio.IProductoServicio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ProductoService implements IProductoServicio {
    
     private final List<Producto> productos = new ArrayList<>();
    private int contadorId = 1;

    @Override
    public int registrarProducto(String codigo, String nombre, String talla, String color, double precio, int stock) {
    int id = contadorId++;
        productos.add(new Producto(id, codigo, nombre, talla, color, precio, stock));
        return id;
    }

    @Override
    public boolean editarProducto(int id, String codigo, String nombre, String talla, String color, double precio, int stock) {
    for (Producto p : productos) {
            if (p.getId() == id) {
                p.setCodigo(codigo);
                p.setNombre(nombre);
                p.setTalla(talla);
                p.setColor(color);
                p.setPrecio(precio);
                p.setStock(stock);
                return true;
            }
        }
        return false;
    }
    

    @Override
    public boolean eliminarProducto(int id) {
        for(Producto p:productos){
        if (p.getId()==id){
            return productos.remove(p);
            
        }
        }
        return false;
    }

    @Override
    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public Producto buscarProductoPorNombre(String nombre) {
         for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
        
    }

    @Override
    public Producto buscarProductoPorId(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    
}
