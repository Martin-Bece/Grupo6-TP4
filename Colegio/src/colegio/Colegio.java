package colegio;

public class Colegio {

    public static void main(String[] args) {
        Materia Laboratorio = new Materia(10,"Laboratorio",1);
        Materia Matemática = new Materia(11,"Matemáticas",1);
        Materia Inglés = new Materia(12,"Ingles I",1);
        
        Alumno a1 = new Alumno(1001,"Lopez","Martín");
        Alumno a2 = new Alumno(1001,"Martínez","Brenda");
        
        a1.agregarMateria(Inglés);
        a1.agregarMateria(Laboratorio);
        a1.agregarMateria(Matemática);
        a2.agregarMateria(Inglés);
        a2.agregarMateria(Matemática);
        a2.agregarMateria(Laboratorio);
        a2.agregarMateria(Laboratorio);
        
        System.out.println("Cantidad de materias de López: "+a1.cantidadMaterias());
        System.out.println("Cantidad de materias de Martínez: "+a2.cantidadMaterias());
    }
    
}
