/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunidad;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author DOLORES FLORES
 */
public class Cobranza {
    private String nom_usuario;
  private String contra;
  private String id;
  private String nivel;
  
  private ArrayList<Cliente> listaClientes;
  private ArrayList<Tecnico> listaTecnicos;
  private ArrayList<Servicio> listaServicios;

public Cobranza(String nom_usuario,String contra,String id,String nivel){
    this.nom_usuario = nom_usuario;
    this.contra = contra;
    this.id = id;
    this.nivel = nivel;
  }

   public Cobranza(String nom_usuario,String contra){
    this.nom_usuario = nom_usuario;
    this.contra = contra;
    id = "Cobranzas";
    nivel = "cobranza";
  }

  
  public void menu_Cobranza(){
    Scanner sc = new Scanner(System.in);
    boolean salir = false;
    int opcion=0;
    while(opcion!=4);{
    System.out.println("1. Generar facturas a empresas");
    System.out.println("2. Reporte de ingresos por servicios");
    System.out.println("3. Reporte de atenciones por tecnico");
    System.out.println("Ingrese el numero de la opcion que desee realizar: ");
    opcion = sc.nextInt();  
    if (opcion==1){
        System.out.println("Ingrese el codigo de la empresa: ");
        String codigo1= sc.nextLine();
        String gk = sc.nextLine();
        System.out.println("Ingrese el Año y el Mes (Año-Mes): ");
        String fecha1= sc.nextLine(); 
        generarFacturas(codigo1,fecha1);
    }
      if (opcion==2){
        reporteDeIngresos();
      }
      if (opcion==3){
        reporteDeAtenciones();
      }
      
      
    }
  sc.close();
  }
  
  public void generarFacturas(String codigo, String fecha){
    int total = 50;
    int cantidad= 0;
    Cliente prueba = new Cliente(codigo," ", " ", " ", TipoCliente.EMPRESARIAL);
    if (listaClientes.contains(prueba)){
      int ind = listaClientes.indexOf(prueba);
      Cliente empresa = listaClientes.get(ind);
      System.out.println("Encontrado:" + empresa.getNombre() + " "+ empresa.getClass());
      System.out.println("Generando la factura para el cliente "+empresa.getNombre());
      System.out.println("Empresa: "+empresa.getNombre());
      System.out.println("Periodo de facturación: "+fecha);
      System.out.println("Detalle de servicios: ");
      System.out.println("#Placa     Fecha     Tipo       Servicio          Cantidad   Total ");
      for(Servicio servicio: listaServicios){
        if(servicio.getFecha()==fecha && servicio.getCodigo()==codigo){
          cantidad ++;
          for(int x=0;x<listaServicios.size();x++){
            System.out.println(servicio.getPlaca()+"     "+servicio.getFecha()+"     "+servicio.getTipoAuto()+"       "+servicio.getNombre()+"          "+cantidad+"   "+servicio.getPrecio()*cantidad);
            total+=servicio.getPrecio()*cantidad;
            }
            System.out.println("Tarifa empresarial +$50");
            System.out.println("Total a pagar: "+total);
          }
      }
    }
  }  
    


  public void reporteDeIngresos(){
    int cant = 0;
    ArrayList<String> listaNombresServicios = new ArrayList<String>();
    Scanner sc2= new Scanner(System.in);
    System.out.println("Ingrese el Año y el Mes (Año-Mes): ");
    String fecha2= sc2.nextLine();
    System.out.println("Servicio             Total");
    for(int i=0;i<listaServicios.size(); i++){
      Servicio servicio1=listaServicios.get(i);
      if(servicio1.getFecha()==fecha2){
        listaNombresServicios.add(servicio1.getNombre());
      }
    }
    boolean salir = false;
    do{
      for (int x =0;x<listaServicios.size();x++){
        if(listaServicios.get(x).getFecha()==fecha2 && listaServicios.get(x).getNombre() == listaNombresServicios.get(x))
        cant++;
        else{
          System.out.println(listaNombresServicios.get(x)+"             "+listaServicios.get(x).getPrecio()*cant);
          cant =0;
          break;
        }
        if (x==listaServicios.size()){
          salir = true;
        }
      }
    }while (!salir);
    sc2.close();
  }


  
  public void reporteDeAtenciones(){
    ArrayList<String> listaNombresTecnicos = new ArrayList<String>();
    int total = 0;
    Scanner sc3= new Scanner(System.in);
    System.out.println("Ingrese el Año y el Mes (Año-Mes): ");
    String fecha3= sc3.nextLine(); 
    System.out.println("Tecnico             Total");
    for(int i=0;i<listaServicios.size(); i++){
      Servicio servicio1 = listaServicios.get(i);
      Tecnico tecnico1 =listaTecnicos.get(i);
      if(servicio1.getFecha()==fecha3){
        listaNombresTecnicos.add(tecnico1.getNombre());
      }
    }
    boolean salir = false;
    do{
      for (int x =0;x<listaTecnicos.size();x++){
        if(listaTecnicos.get(x).getNombre() == listaNombresTecnicos.get(x)){     
          total += listaServicios.get(x).getPrecio();
        } 
        else{
          System.out.println(listaNombresTecnicos.get(x)+"             "+total);
          total =0;
          break;
        }  
      } 
    } while(!salir);
    sc3.close();
  }  

  
  public String getNom_usuario(){
    return nom_usuario;
  }

  public String getContra(){
    return contra;
  }




}
