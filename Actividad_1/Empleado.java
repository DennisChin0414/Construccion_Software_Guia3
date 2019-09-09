
/**
 * Write a description of class Empleado here.
 * 
 * @author Dennis Urrea/Alejandro Rodriguez Mancera 
 * @version 08232019
 */

public class Empleado
{
    private String nombre;
    private String departamento;
    private String posicion;
    private int salario;
    

    /**
     * Constructor for objects of class Empleado
     */
    public Empleado(String nombre, String departamento, String posicion, int salario)
    {
        // variables inicializadas
        this.nombre=nombre;
        this.departamento=departamento;
        this.posicion=posicion;
        this.salario=salario;
        
    }

     public void setNombre(String nombre)
     {
        this.nombre = nombre;
     }

    public String getNombre()
    {
        return nombre;
    }
    
    public void setDepartamento(String departamento)
     {
        this.departamento = departamento;
     }

    public String getDepartamento()
    {
        return departamento;
    }
    
    public void setPosicion(String posicion)
     {
        this.posicion = posicion;
     }

    public String getPosicion()
    {
        return posicion;
    }
    
    public void setSalario(int salario)
     {
        this.salario = salario;
     }

    public int getSalario()
    {
        return salario;
    }
}
