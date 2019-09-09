/**
 * Write a description of class Empleado here.
 * 
 * @author Dennis Urrea/Alejandro Rodriguez Mancera 
 * @version 08232019
 */

import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class Supermercado

{
  String nombre="Santa Fe";
  String localidad="Fontibón";
    
    
    public static void main(String [] args)
    {
         int opcion;
         int contador=1;
         boolean mantener=true;
         String nombre;
         String departamento;
         String posicion;
         int salario;
         ArrayList <Empleado>empleados=new ArrayList();
         
         
         
        // asociar teclado al programa
        Scanner teclado = new Scanner(System.in);
        while(mantener)
        {
          System.out.println("0.Agregar Empleado");    
          System.out.println("1.Departamento del Empleado");
          System.out.println("2.Cargo del Empleado");
          System.out.println("3.Mostrar Informacion de Todos");
          System.out.println("4.Salir del Progama");   
          opcion = teclado.nextInt();
          
          switch(opcion)
          
           {
              case 0:
              
                System.out.println("Ingrese el nombre del empleado   : "+ contador);
                nombre = teclado.next();
                contador++;  
                System.out.println("Ingrese departamento del empleado   :");
                departamento = teclado.next();
                System.out.println("Ingrese cargo del empleado   :");
                posicion = teclado.next();
                System.out.println("Ingrese salario del empleado   :");
                salario = teclado.nextInt();
                empleados.add(new Empleado(nombre,departamento,posicion,salario));
                break;
                
                case 1:
                
                System.out.println("Ingrese el nombre del empleado   : ");
                nombre = teclado.next();
                
                
                for (Empleado a : empleados)
                {
                    if (a.getNombre().equals(nombre))
                    {
                       System.out.println("Empleados:  "+a.getNombre()+"Departamento  "+a.getDepartamento());
                    
                    }
                 }
               break;
               
               case 2:
                
                System.out.println("Ingrese cargo del empleado : ");
                nombre = teclado.next();
                
                for (Empleado a : empleados)
                {
                    if (a.getNombre().equals(nombre))
                    {
                       System.out.println("Empleados:  "+a.getNombre()+"posicion  "+a.getPosicion());
                    
                    }
                 }
               break;
               
               case 3:
               
                for (Empleado a : empleados)
                {
                    
                       System.out.println("Nombre:  "+a.getNombre()+"departamento  "+a.getDepartamento()+"posicion  "+a.getPosicion()+"salario  "+a.getSalario());
                    
                    
                }
                break;
                
                case 4:
                
                mantener=false;
                break;
                default:
                 System.out.println("Ingreso mal la opción");
        }   
    }
}
}   
 