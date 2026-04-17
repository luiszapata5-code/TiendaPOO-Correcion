/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zapataluis.tiendapoo.servicio.impl;

import com.zapataluis.tiendapoo.correcion.model.Cliente;
import com.zapataluis.tiendapoo.correcion.model.DetalleVenta;
import com.zapataluis.tiendapoo.correcion.model.Producto;
import com.zapataluis.tiendapoo.correcion.model.Venta;
import com.zapataluis.tiendapoo.servicio.IVentaServicio;
import java.util.ArrayList;
import java.util.List;


public class VentaServicio implements IVentaServicio {
    private final List<Venta> ventas = new ArrayList<>();
    private int contadorId = 1;

    @Override
    public boolean registrarVenta(Cliente cliente, List<DetalleVenta> detalles) {
        if (cliente == null || detalles == null || detalles.isEmpty()) {
            return false;
        }
        
        
        
        

        // Validar stock de todos los productos antes de confirmar
        for (DetalleVenta d : detalles) {
            if (d.getProducto().getStock() < d.getCantidad()) {
                return false;
            }
            
        }

        // Calcular total y descontar stock
        double total = 0;
        for (DetalleVenta d : detalles) {
            Producto p = d.getProducto();
            total += p.getPrecio() * d.getCantidad();
            p.setStock(p.getStock() - d.getCantidad());
        }

        // CORRECCIÓN del bug anterior: se pasa una copia de la lista
        int id = contadorId++;
        ventas.add(new Venta(id, cliente, total, new ArrayList<>(detalles)));
        return true;
    
    }

    @Override
    public List<Venta> getVentas() {
        return ventas;
    }
    
}
