/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.zapataluis.tiendapoo.servicio;
import com.zapataluis.tiendapoo.correcion.model.Cliente;
import java.util.List;

// anteriormente no habiamos agregado interfaces violando 2 principios SOLID ISP OCP 
//ISP ya que no usamos ninguna interface aumulando todo  en una sola clase
//OCP ya que al momento de querer cambiar algo podamos usar la misma interfaz sin tener que cambiart todo el codigo
// las interfaces son como un contrato te dicen que hacer y que entregar pero no como 
// eso es lo que vamos a hacer 
public interface IClienteServicio {
    // registra un cliente y retorna el id (int)
    int RegistrarCliente(String nombre,int edad,String correo);
    // edita un cliente y retorna un valor boolean para saver si encontro el cliente
    boolean EditarCliente(int id,String nombre,int edad,String correo);
    // elimina un cliente y retorna un valor boolena para saber si lo encontro
    boolean EliminarCliente(int id);
     // Retorna la lista de todos los clientes
    List<Cliente> getCliente();
    
    // Busca un cliente por su ID y retorna un cliente 
    Cliente buscarClientePorId(int id);
    
    
}
