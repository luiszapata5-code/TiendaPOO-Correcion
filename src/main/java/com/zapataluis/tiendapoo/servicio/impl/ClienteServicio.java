/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zapataluis.tiendapoo.servicio.impl;

// una clase servicio o un paqute impl lo que hace es "cumplir con el contrato del interfaz" en potras palabras hacer que los metodos funcionen con lo entregado y devuelvan lo pedido

import com.zapataluis.tiendapoo.correcion.model.Cliente;
import com.zapataluis.tiendapoo.servicio.IClienteServicio;
import java.util.ArrayList;
import java.util.List;


public class ClienteServicio implements IClienteServicio{
    
    private final List<Cliente> clientes = new ArrayList<>();
    private int contadorId = 1; // IDs incrementales, sin Random para evitar IDs repetridos

    @Override
    public int RegistrarCliente(String nombre, int edad, String correo) {
        // se llaman los metodos o contratos implementados en cada interface para que cumplan con lo prometido
       int id = contadorId++;
       clientes.add(new Cliente(id,nombre,edad,correo));
       return id;
       
    }

    @Override
    public boolean EditarCliente(int id,String nombre, int edad, String correo) {
        for (Cliente c: clientes){// para una variable iteradora c se tipo objeto en la lista clientes
        if(c.getId()==id){
            c.setNombre(nombre);
            c.setEdad(edad);
            c.setCorreo(correo);
            return true;
            
        }
        }
        return false;
        
    }

    @Override
    public boolean EliminarCliente(int id) {
         for (Cliente c: clientes){
         if(c.getId()==id){
         return clientes.remove(c);
         }
                 }
         return false;
    }

    @Override
    public List<Cliente> getCliente() {
        return clientes;
        
    }

    @Override
    public Cliente buscarClientePorId(int id) {
          for (Cliente c : clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
    }
    

