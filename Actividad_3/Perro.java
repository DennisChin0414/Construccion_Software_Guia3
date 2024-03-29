
/**
 * Write a description of class Perro here.
 * 
 * @author Dennis Urrea/Alejandro Rodriguez Mancera  
 * @version 27082019
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Perro
{
    String nombre;
    String raza;
    String localidad;
    double cedula;
    double telefono;
    double dias_asistencia;
    String nombre_dueño;
    
    /**
     * Constructor for objects of class Perro
     */
    public Perro(String nombre, String raza, String localidad, String nombre_dueño, double cedula, double telefono, double dias_asistencia)
    {
        // inicializar las variables
        this.nombre = nombre;
        this.raza = raza;
        this.localidad = localidad;
        this.nombre_dueño = nombre_dueño;
        this.cedula = cedula;
        this.telefono = telefono;
        this.dias_asistencia = dias_asistencia;
    }

     
    
     public static void main(String[] args) {
        int opcion ;
        int contador = 1;
        boolean mantener = true;
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String raza;
        String localidad; 
        String nombre_dueño;
        double cedula;
        double telefono; 
        double dias_asistencia;
        ArrayList <Perro> perros = new ArrayList ();
        ArrayList <Perro> teusaquillo = new ArrayList();
        ArrayList <Perro> suba = new ArrayList();
        ArrayList <Perro> usaquen = new ArrayList();
        ArrayList <Perro> chapinero = new ArrayList();
        ArrayList <Perro> otros = new ArrayList();
      
        while(mantener){
        
        System.out.println("1. Crear un perro");
        System.out.println("2. Mostrar todos los perros y sus datos");
        System.out.println("3. Agrupar perros por localidad");
        System.out.println("4. Salir del progama");
        
        opcion = teclado.nextInt(); 
                
        switch(opcion){
            
            case 1:
                System.out.println("Ingrese el nombre del Perro  : "+ contador);
                 nombre = teclado.next();
                contador++;  
                System.out.println("Ingrese la raza del perro   :");
                 raza = teclado.next  ();
                System.out.println("Ingrese la localidad donde vive el perro :");
                 localidad = teclado.next  ();
                System.out.println("Ingrese el nombre del dueño del perro  :");
                 nombre_dueño= teclado.next  ();   
                 System.out.println("Ingrese la cédula del dueño del perro  :");
                 cedula = teclado.nextDouble();
                System.out.println("Ingrese número de días de asistencia del perro  :");
                 dias_asistencia = teclado.nextDouble();
                 System.out.println("Ingrese teléfono del dueño del perro  :");
                 telefono = teclado.nextDouble();
                 perros.add(new Perro(nombre,raza,localidad,nombre_dueño,cedula,telefono,dias_asistencia));
                break;
                
            case 2:
               for (Perro p: perros)
               {
                 System.out.println("Nombre del perro  :" + p.nombre   + "Raza del perro   :" + p.raza  +"La localidad del perro   :" +p.localidad + "Dueño del perro   :" + p.nombre_dueño + "Cédula del dueño   :" + p.cedula +"Dias de asistencia del perro   :" + p.dias_asistencia + "Teléfono del dueño   :" + p.telefono);  
                   
               }
              
               break;
               
            case 3:
            
            System.out.println("Perros agrupados por localidad   :");
            
            for (Perro p: perros)
               {              
                 
                 if (p.localidad.equals("Teusaquillo"))
                 {
                     teusaquillo.add(p);
                     
                 }
                 
                 else if (p.localidad.equals("Suba"))
                 {
                   suba.add(p); 
                    
                 }
                 
                 else if (p.localidad.equals("Usaquén "))
                 {
                   usaquen.add(p); 
                    
                 }
                 
                 else if (p.localidad.equals("Chapinero"))
                 {
                   chapinero.add(p); 
                    
                 }
                 
                 else 
                 {
                   otros.add(p); 
                    
                 }
                 
               }
               
               for (Perro i: teusaquillo)
               
               {
                System.out.println("Nombre del perro   :" + i.nombre  + "Localidad   :" + i.localidad);
                
               }
                
                for (Perro i: suba)
               
               {
                System.out.println("Nombre del perro   :" + i.nombre  + "Localidad   :" + i.localidad);
                
               }
               
                for (Perro i: usaquen)
               
               {
                System.out.println("Nombre del perro   :" + i.nombre  + "Localidad   :" + i.localidad);
                
               }
               
                for (Perro i: chapinero)
               
               {
                System.out.println("Nombre del perro   :" + i.nombre  + "Localidad   :" + i.localidad);
                
               }
               
               System.out.println("Perros con localidades invalidas");
               
               for (Perro i: otros)
               
               {
                System.out.println("Nombre del perro   :" + i.nombre  + "Localidad   :" + i.localidad);
                
               }
                break;
            case 4:
              mantener = false;  
              break ;           
            default: 
                 System.out.println("Ingreso mal la opcion");
        
        }
        }
    }
}