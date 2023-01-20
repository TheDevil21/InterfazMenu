/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu;

import Comunidad.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Callback;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;



/**
 *
 * @author DOLORES FLORES
 */
public class InicioSesion {
    Label lbUsuario= new Label("Usuario");
    Label lbContra= new Label("Contraseña"); 
    
    TextField usuario;
    TextField contra;
    
    Button inicio = new Button("Iniciar Sesion");
    
    VBox vInicio= new VBox(5.0);
    
    static ArrayList<Usuario> listaUsuarios;
    static ArrayList<Cobranza> listaCobranza;
    static ArrayList<Tecnico> listaTecnicos;
    
    
    
    
    public void iniatialize(){
        vInicio.setAlignment(Pos.CENTER);
        vInicio.getChildren().add(lbUsuario);
        vInicio.getChildren().add(usuario);
        vInicio.getChildren().add(contra);
        vInicio.getChildren().add(inicio);
        llenarListas();
        
        if (esteUsuarioSeEncuentraEnLaLista(usuario.getText(),contra.getText(),listaUsuarios,listaTecnicos,listaCobranza)){
            for(Usuario u: listaUsuarios){
                if(u.getNombre().equals(usuario.getText()) && u.getContra().equals(contra.getText()) ){
                    if (u instanceof Admin){
                        Admin adm = (Admin) u;
                        adm.menu_admin();
        
                      }
                }
                
            }
            
            for(Tecnico t: listaTecnicos){
                if(t.getNombre().equals(usuario.getText()) && t.getContra().equals(contra.getText()) ){
                   t.menu_tecnico();
                      }
                }
            
            for(Cobranza c: listaCobranza){
                if(c.getNom_usuario().equals(usuario.getText()) && c.getContra().equals(contra.getText()) ){
                   c.menu_Cobranza();
                      }
                }
            
            }
            
            
        }
        

    
    
    public static void llenarListas(){
    listaUsuarios.add(new Admin("admin1","12345678"));

    listaTecnicos.add(new Tecnico("alopez","al123456"));
    listaTecnicos.add(new Tecnico("mbarcos","mb123456"));

    listaCobranza.add(new Cobranza("mccastro","mc123456"));
    }
    
      public static boolean esteUsuarioSeEncuentraEnLaLista(String usuario, String clave,ArrayList<Usuario> listaUsuarios, ArrayList<Tecnico> listaTecnicos, ArrayList<Cobranza> listaCobranza){
    for(Usuario usuarioAux:listaUsuarios){
      if(usuarioAux.getNombre().equals(usuario) && usuarioAux.getContra().equals(clave)){
        return true;
      }
    }

    for(Tecnico usuarioAux:listaTecnicos){
      if(usuarioAux.getNom_usuario().equals(usuario) && usuarioAux.getContra().equals(clave)){
        return true;
      }
    }

    for(Cobranza usuarioAux:listaCobranza){
      if(usuarioAux.getNom_usuario().equals(usuario) && usuarioAux.getContra().equals(clave)){
        return true;
      }
    }

      }
}

