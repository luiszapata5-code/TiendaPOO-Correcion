/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.zapataluis.tiendapoo.servicio;

import com.zapataluis.tiendapoo.correcion.Producto;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IProductoServicio {
        // Registra un producto y retorna el ID asignado
    int registrarProducto(String codigo, String nombre, String talla, 
                          String color, double precio, int stock);
    
    // Edita un producto existente, retorna true si lo encontró
    boolean editarProducto(int id, String codigo, String nombre, String talla,
                           String color, double precio, int stock);
    
    // Elimina un producto por ID, retorna true si lo encontró
    boolean eliminarProducto(int id);
    
    // Retorna la lista de todos los productos
    List<Producto> getProductos();
    
    // Busca un producto por su nombre
    Producto buscarProductoPorNombre(String nombre);
    
    // Busca un producto por su ID
    Producto buscarProductoPorId(int id);
    
}
