/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.zapataluis.tiendapoo.servicio;

import com.zapataluis.tiendapoo.correcion.model.Cliente;
import com.zapataluis.tiendapoo.correcion.model.DetalleVenta;
import com.zapataluis.tiendapoo.correcion.model.Venta;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IVentaServicio {
  // Registra una venta completa con su lista de productos
    // Retorna true si se registró correctamente
    boolean registrarVenta(Cliente cliente, List<DetalleVenta> detalles);
    
    // Retorna el historial de todas las ventas
    List<Venta> getVentas();
    
}
