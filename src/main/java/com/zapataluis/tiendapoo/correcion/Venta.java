package com.zapataluis.tiendapoo.correcion;

import java.util.ArrayList;


public class Venta {

    private int id;
    private Cliente cliente;
    private double total;
    private ArrayList<DetalleVenta> sobre;

    public Venta(int id, Cliente cliente,  double total,ArrayList<DetalleVenta> sobre){
        this.id = id;
        this.cliente = cliente;
        this.total = total;
        this.sobre= sobre;
    }
    
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
        return sobre;
    }

    public void setSobreLaVenta(ArrayList<DetalleVenta> sobre) {
        this.sobre = sobre;
    }
    
}
    
    
    

