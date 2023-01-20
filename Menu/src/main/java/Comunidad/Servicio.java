/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunidad;

/**
 *
 * @author DOLORES FLORES
 */
public class Servicio {
    private String codigo;
  private String nombre;
  private double precio;
  private String fecha;
  private String placa;
  private TipoAuto tipoAuto;
  

  public Servicio(String codigo, String fecha, TipoAuto tipoAuto, String placa){
    this.codigo= codigo;
    this.fecha = fecha;
    this.tipoAuto = tipoAuto;
    this.placa = placa;
    
  }
  
  public Servicio(String codigo, String nombre, double precio){
    this.codigo=codigo;
    this.nombre=nombre;
    this.precio=precio;
  }




//Getters

  public String getCodigo(){
    return codigo;
  }

  public String getFecha(){
    return fecha;
  }
  
  public String getPlaca(){
    return placa;
  }

  public TipoAuto getTipoAuto(){
    return tipoAuto;
  }
  
  public String getNombre(){
    return nombre;
  }
  
  public double getPrecio(){
    return precio;
  }

  public void setPrecio(double precio){
    this.precio = precio;
  }
  
}
