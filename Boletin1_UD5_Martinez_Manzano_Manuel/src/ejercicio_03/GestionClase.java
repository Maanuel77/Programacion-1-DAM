package ejercicio_03;

import java.util.HashSet;
import java.util.Set;

public class GestionClase {
    private String nombre_Curso;
    private Set<Alumno> conjunto_Alumnos;

    public GestionClase(String nombre_Curso) {
        this.nombre_Curso = nombre_Curso;
        this.conjunto_Alumnos = new HashSet<>();
    }

    // Agregar un alumno al Set
    public boolean agregar_Alumno(Alumno a) {
        return conjunto_Alumnos.add(a);
    }

    // Buscar y devolver un alumno por DNI
    public Alumno buscar_Alumno(String dni) {
        for (Alumno a : conjunto_Alumnos) {
            if (a.getDni().equalsIgnoreCase(dni)) {
                return a;
            }
        }
        return null;
    }

    // Borrar alumno por DNI
    public boolean borrar_Alumno(String dni) {
        Alumno a_Borrar = buscar_Alumno(dni);
        if (a_Borrar != null) {
            return conjunto_Alumnos.remove(a_Borrar);
        }
        return false;
    }

    // Calcular nota media de todo el curso
    public double calcular_Media_Curso() {
        if (conjunto_Alumnos.isEmpty()) return 0.0;
        
        double suma = 0;
        for (Alumno a : conjunto_Alumnos) {
            suma += a.getNota();
        }
        return suma / conjunto_Alumnos.size();
    }

    // Obtener total de alumnos suspensos
    public int get_Total_Suspensos() {
        int contador = 0;
        for (Alumno a : conjunto_Alumnos) {
            if (a.getNota() < 5.0) {
                contador++;
            }
        }
        return contador;
    }

    // Calcular nota media de los suspensos
    public double calcular_Media_Suspensos() {
        int total_Suspensos = 0;
        double suma_Suspensos = 0;
        
        for (Alumno a : conjunto_Alumnos) {
            if (a.getNota() < 5.0) {
                suma_Suspensos += a.getNota();
                total_Suspensos++;
            }
        }
        
        if (total_Suspensos == 0) return 0.0;
        return suma_Suspensos / total_Suspensos;
    }

    // Mostrar todos los alumnos
    public void mostrar_Todos() {
        if (conjunto_Alumnos.isEmpty()) {
            System.out.println("No hay alumnos en el curso.");
        } else {
            for (Alumno a : conjunto_Alumnos) {
                System.out.println(a.toString());
            }
        }
    }
}