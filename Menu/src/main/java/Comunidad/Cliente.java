/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunidad;

/**
 *
 * @author DOLORES FLORES
 */
public class Cliente extends Perfil{
    private TipoCliente tipo;

  public Cliente(String codigo, String nombre, String direccion, String telefono, TipoCliente tipo){

    super(codigo, nombre, direccion, telefono);
    this.tipo=tipo;
  
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

  public TipoCliente getTipo(){
    return tipo;
  }
}
