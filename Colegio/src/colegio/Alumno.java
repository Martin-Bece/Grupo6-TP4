
package colegio;

import java.util.HashSet;

public class Alumno 
{
    private int legajo;
    private String apellido;
    private String nombre;
    
    private HashSet<Materia> contenedor = new HashSet();
   

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return legajo + ", " + apellido + " " + nombre;
    }
    
    
    
}
