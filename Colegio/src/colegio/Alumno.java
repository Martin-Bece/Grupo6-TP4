
package colegio;

import java.util.HashSet;

/**
 *
 * @author Celi Leandro
 */
public class Alumno 
{
    private int legajo;
    private String apellido;
    private String nombre;
    
    private HashSet<Materia> contenedor;
   

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m)
    {
        contenedor.add(m);
    }
    
    public int cantidadMaterias()
    {
       return contenedor.size();    
    }
            
}
