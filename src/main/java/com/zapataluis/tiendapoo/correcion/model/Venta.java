package com.zapataluis.tiendapoo.correcion.model;

import com.zapataluis.tiendapoo.correcion.model.Cliente;
import java.util.ArrayList;


public class Venta {

    private int id;
    private Cliente cliente;
    private double total;
    private ArrayList<DetalleVenta> detalle;// se crean las variables de caracter privado para la clase venta 

    public Venta(int id, Cliente cliente,  double total,ArrayList<DetalleVenta> detalle){//constructor
        this.id = id;
        this.cliente = cliente;
        this.total = total;
        this.detalle = new ArrayList<>(detalle);// esto es lo que nos permitira crear una copia de la venta y arreglar el error del carrito 
        
    }
    //getandsetters
    
    public int getId(){
        return id;
    }

    public Cliente getCliente(){
        return cliente;
    }


    public double getTotal(){
        return total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<DetalleVenta> getSobreLaVenta() {
        return detalle;
    }

    public void setSobreLaVenta(ArrayList<DetalleVenta> sobre) {
        this.detalle = sobre;
    }
    
}
    
    
    

