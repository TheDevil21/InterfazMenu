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
public class Admin extends Usuario{
     public ArrayList<Cliente> listaClientes= new ArrayList<>();
  
  public ArrayList<Proveedor> listaProveedores= new ArrayList<>();
  public ArrayList<Servicio> listaServicios= new ArrayList<>();
  public ArrayList<Usuario> listaUsuarios;


  public Admin(String nom_usuario,String contra){
    super(nom_usuario, contra);
    id = "Administrador";
    nivel = "admin";
    
 }

  

  public void Administrar_servicios(){
    Scanner sc = new Scanner(System.in);
    listaServicios.add(new Servicio("HOD","Servir",95.0));
    listaServicios.add(new Servicio("KLM","Barrer",75.0));
    for (Servicio a: listaServicios){
      System.out.println(a.getCodigo()+" "+a.getNombre()+" "+a.getPrecio());
    }
    
    int opcion=0;
    while(opcion != 3){
      System.out.println("1. Agregar Servicio");
      System.out.println("2. Editar Servicio");
      System.out.println("3. Regresar al menú principal");
      System.out.println("Escribe una de las opciones");
      opcion = sc.nextInt();
      if (opcion==1){
        
          System.out.println("1. Has seleccionado la opcion 1.1");    
          System.out.println("Ingrese el nombre del servicio:");
          String nombre = sc.nextLine();
          String as= sc.nextLine();
          System.out.println("Ingrese el precio del servicio:");
          double precio = sc.nextDouble();
          System.out.println("Ingrese el codigo del servicio:");
          String codigo = sc.nextLine();
          String afs= sc.nextLine();
      
         listaServicios.add(new Servicio(codigo,nombre,precio));
      }
        if (opcion==2){
          System.out.println("Ingrese el nombre del servicio:");
          String nombre1 = sc.nextLine();
          String hj= sc.nextLine();

          Servicio buscador= new Servicio("",nombre1,0);
          if(listaServicios.contains(buscador)){
            int indice=listaServicios.indexOf(buscador);
            Servicio serv= listaServicios.get(indice);
            System.out.println("Ingrese el nuevo precio del servicio:");
              double precio2 = sc.nextDouble();
              serv.setPrecio(precio2);
          }
          /*
          for (int i=0; i<listaServicios.size();i++){
            if ((listaServicios.get(i).getNombre()).equals(nombre1)){
              
              System.out.println("Ingrese el nuevo precio del servicio:");
              double precio2 = sc.nextDouble();
              listaServicios.get(i).setPrecio(precio2);
            }
            } 
          */
          }
          if(opcion==3){
            menu_admin();
          }   
      }
    sc.close();
    }
    
  
  
  
  public void Administrar_clientes(){
    Scanner sc = new Scanner(System.in);

    listaClientes.add(new Cliente("HD","Mauricio","Ceibos","0956482731",TipoCliente.EMPRESARIAL));
    listaClientes.add(new Cliente("lkja","cliente1","Urdesa","099999999",TipoCliente.PERSONAL));
    
      for (Cliente a: listaClientes){
    System.out.println(a.getCodigo()+" "+a.getNombre()+" "+a.getDireccion()+" "+a.getTelefono()+" "+a.getTipo());
    }
    
    
    int opcion=0;
    while(opcion!=2){
      System.out.println("1. Administrar Clientes");
      System.out.println("2. Regresar al menú principal");
      System.out.println("Escribe una de las opciones");
      opcion = sc.nextInt();
      if(opcion==1){
        
          System.out.println("Has seleccionado la opcion 1.1");
          System.out.println("Ingrese la cedula o Ruc del cliente:");
          String cedula = sc.nextLine();
          String ass= sc.nextLine();
          System.out.println("Ingrese el nombre del cliente:");
          String nombre = sc.nextLine();
          String as= sc.nextLine();
          System.out.println("Ingrese la direccion del cliente:");
          String direccion = sc.nextLine();
          String hj= sc.nextLine();
          System.out.println("Ingrese el telefono del cliente:");
          String telefono = sc.nextLine();
          String lk = sc.nextLine();
          System.out.println("Ingrese el tipo del cliente (PERSONAL o EMPRESARIAL):");
          String alfa = sc.nextLine();
          String ll = sc.nextLine();
          if (alfa == "PERSONAL" )
            listaClientes.add(new Cliente(cedula,nombre,direccion,telefono,TipoCliente.PERSONAL));
          else if (alfa == "EMPRESARIAL")
            listaClientes.add(new Cliente(cedula,nombre,direccion,telefono,TipoCliente.EMPRESARIAL));
      }
        if(opcion==2){
          menu_admin();
        }
      } 
    sc.close();
    } 
    
  

  
  public void Administrar_proovedores(){
    Scanner sc = new Scanner(System.in);
    listaProveedores.add(new Proveedor("HD","Mauricio","Ceibos","0956482731"));
    
    for (Proveedor a: listaProveedores){
      System.out.println(a.getCodigo()+" "+a.getNombre()+" "+a.getDireccion()+" "+a.getTelefono());
    }
    
    int opcion=0;
    while(opcion!=2){
      System.out.println("1. Agregar Proveedor");
      System.out.println("2. Regresar al menú principal");
      System.out.println("Escribe una de las opciones");
      opcion = sc.nextInt();
      if(opcion==1){
          System.out.println("1. Has seleccionado la opcion 2.1");    
          System.out.println("Ingrese el nombre del proveedor :");
          String nombre = sc.nextLine();
          String as= sc.nextLine();
          System.out.println("Ingrese la direccion del proveedor:");
          String direccion = sc.nextLine();
          String hj= sc.nextLine();
          System.out.println("Ingrese el telefono del proveedor:");
          String telefono = sc.nextLine();
          String ll = sc.nextLine();
          listaProveedores.add(new Proveedor("",nombre,direccion,telefono));
      }
        if(opcion==2)
          menu_admin();  
      }
    sc.close();
    }
    
  


  
  public void menu_admin(){
    Scanner sc = new Scanner(System.in);
    
    int opcion=0; 
    while (opcion!=4) {
      System.out.println("1. Administrar Clientes");
      System.out.println("2. Administrar Proveedores");
      System.out.println("3. Administrar servicios");
      System.out.println("4. Salir");
      System.out.println("Escribe una de las opciones");
      opcion = sc.nextInt();
     if (opcion==1){
          System.out.println("Has seleccionado la opcion 1");
          Administrar_clientes();
     }
      if (opcion==2){
          System.out.println("Has seleccionado la opcion 2");
          Administrar_proovedores();
      }
       if (opcion==3){
          System.out.println("Has seleccionado la opcion 3");
          Administrar_servicios();
       }
        
      
    }sc.close();
  }
}
