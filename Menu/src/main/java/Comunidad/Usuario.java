/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunidad;

/**
 *
 * @author DOLORES FLORES
 */
public abstract class Usuario {
     protected String nom_usuario;
  protected String contra;
  protected String id;
  protected String nivel;
  
  public Usuario(String nom_usuario,String contra,String id,String nivel){
    this.nom_usuario = nom_usuario;
    this.contra = contra;
    this.id = id;
    this.nivel = nivel;
  }

  public Usuario(String nom_usuario,String contra){
    this.nom_usuario = nom_usuario; 
    this.contra = contra;
    id = "";
    nivel = "Usuario";
  }

  public String getNombre(){
    return nom_usuario;
  }
  public String getContra(){
    return contra;
  }
  public String getId(){
    return id;
  }
  public String getNivel(){
    return nivel;
  }  
}
