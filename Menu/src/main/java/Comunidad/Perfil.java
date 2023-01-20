/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunidad;

/**
 *
 * @author DOLORES FLORES
 */
public abstract class Perfil {
      
  protected String codigo;
  protected String nombre;
  protected String direccion;
  protected String telefono;


  public Perfil(String codigo, String nombre, String direccion, String telefono){
    this.codigo=codigo;
    this.nombre=nombre;
    this.direccion=direccion;
    this.telefono=telefono;
    
  }


    
}
