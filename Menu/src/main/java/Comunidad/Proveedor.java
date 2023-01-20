/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunidad;

/**
 *
 * @author DOLORES FLORES
 */
public class Proveedor extends Perfil{
    public Proveedor(String codigo, String nombre, String direccion, String telefono){

  super(codigo, nombre, direccion, telefono);
  }









//Getters
  public String getCodigo(){
    return codigo;
  }

  public String getNombre(){
    return nombre;
  }

  public String getDireccion(){
    return direccion;
  }

  public String getTelefono(){
    return telefono;
  }  
}
