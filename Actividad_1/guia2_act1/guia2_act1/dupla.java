package guia2_act1;

/**
 * Write a description of class Empleado here.
 * 
 * @author Dennis Urrea/Alejandro Rodriguez Mancera 
 * @version 08232019
 */

public class dupla
{
    
    private int[] dupla = new int [2];
    
    public int[] lee()
    
    {
        
        return dupla;        
        
    }
    
    
    public void guardar (int a, int b)
    
    {
    
      dupla[0] = a;
      dupla[1] = b;    
    
    }
    
    public dupla (){}
    public static void main(String [] args)
    
    {
    
    int []arreglo;    
    dupla primerpar = new dupla();
    primerpar.guardar(12,32);
    arreglo = primerpar.lee();
    System.out.println("El valor del primer par es   " + arreglo[0]+","+arreglo[1]);
    
    
    }
}
