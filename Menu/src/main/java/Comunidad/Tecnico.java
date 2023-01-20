/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunidad;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DOLORES FLORES
 */
public class Tecnico {
     private String nom_usuario;
  private String contra;
  private String id;
  private String nivel;
  
  public String codigo;
  public String nombre;
  public String direccion;
  public String telefono;
  public ArrayList<Servicio> listaServicios;
  
  public Tecnico(String codigo, String nombre, String direccion, String telefono, String nom_usuario,String contra,String id,String nivel){
    this.codigo = codigo;
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
    this.nom_usuario = nom_usuario;
    this.contra = contra;
    this.id = id;
    this.nivel = nivel;
  }


  
  public Tecnico(String nom_usuario,String contra){
    this.nom_usuario = nom_usuario;
    this.contra = contra;
    id = "Tecnicos";
    nivel = "tecnico";
  }

  
  public void menu_tecnico(){
    Scanner sc = new Scanner(System.in);
    boolean salir = false;
    int opcion=0;
    while(opcion!=3){
      System.out.println("1. Generar orden de servicios");
      System.out.println("2. Reportar falta de insumos");
      System.out.println("3. Salir");
      System.out.println("Ingrese el numero de la opcion que desee realizar: ");
      opcion = sc.nextInt();
      if(opcion==1){
          generarOrdenDeServicio();
          
      }
        if(opcion==2){
          reportarFaltaInsumos();
          
        }
        
    }
    
    sc.close();
  }

  //Esto sirve para agg una orden más a la lista de ordenes: Esta lista contiene ordenes, y las ordenes contienen (codigoDelTecnico, codigoDelaOrden, fechaEnQuesehizo, TipoVehiculo, placaVehiculo, una lista con los servicios que se le realizaron, y el total a pagar)
  //La lista de servicios que recibe contiene todos los servicios posibles, es para sacar esa info de ahí
  public void generarOrdenDeServicio(){
    listaServicios = new ArrayList<>();
    listaServicios.add(new Servicio("klm","limpiar",45));
    listaServicios.add(new Servicio("pjn","cuidar",65));
    listaServicios.add(new Servicio("hbg","sacudir",20));
    listaServicios.add(new Servicio("tyv","pulir",80));
    listaServicios.add(new Servicio("trd","trapear",30));
    listaServicios.add(new Servicio("aex","transporte",50));
    double total= 0.0;
    String cod = "";
    Servicio servicio1= new Servicio("","",0);
    int cant = 0;
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Ingrese el codigo del cliente: ");
    String codigo1 = sc1.nextLine();
    System.out.println("Ingrese la fecha de la orden [Año-Mes]: ");
    String fecha1 = sc1.nextLine();
    System.out.println("Ingrese un número segun corresponda [1=AUTO, 2=MOTOCICLETA, 3=BUS]: ");
    int numtA = sc1.nextInt();
    String ui=sc1.nextLine();
    System.out.println("Ingrese la placa el vehículo:");
    String placa1 = sc1.nextLine();
    System.out.println("A continuación deberá ingresar los servicios realizados. Si no desesa ingresar más servicios, por favor escriba -1.");
    int ind;
    while(!(cod.equals("-1"))){
      System.out.println("Ingrese el código del servicio: ");
      cod = sc1.nextLine();
      Servicio prueba = new Servicio(cod," ", 0);
      System.out.println("Ingrese la cantidad de veces que se utilizó el servicio: ");
      cant = sc1.nextInt();
      sc1.nextLine();
      if (listaServicios.contains(prueba)){
        servicio1 = (Servicio) listaServicios.get(listaServicios.indexOf(prueba));
        listaServicios.add(servicio1);
      }
      total+=(cant*servicio1.getPrecio());
    }
    
    System.out.println("El valor a pagar es "+total);
    if(numtA==1){
      listaServicios.add(new Servicio(codigo1, fecha1, TipoAuto.AUTOMOVIL, placa1));
    }
    if(numtA==2){
      listaServicios.add(new Servicio(codigo1, fecha1, TipoAuto.MOTOCICLETA, placa1));
    }
    if(numtA== 3){
      listaServicios.add(new Servicio(codigo1, fecha1, TipoAuto.BUS, placa1));
    }
    
    sc1.close();
  }

  //Esto devuelve un String con el email que envia el técnico, la idea es que esto se almacene en una lista en el main, para tenerlos guardados
  public String reportarFaltaInsumos(){
    Scanner sc = new Scanner(System.in);
    System.out.println("A continuación escriba su solicitud: ");
    String reporte = sc.nextLine();
    System.out.println("Desea enviar un email al encargado? S/N:");
    String confirmacion = sc.nextLine();
    if (confirmacion == "S"){
      boolean opcion = true;
      
    } else{
      boolean opcion = false;
      
    } 
    
    sc.close();
    return reporte;
  }


//Getters
  
  public String getCodigo(){
    return codigo;
  }

  public String getNom_usuario(){
    return nom_usuario;
  }

  public String getContra(){
    return contra;
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
