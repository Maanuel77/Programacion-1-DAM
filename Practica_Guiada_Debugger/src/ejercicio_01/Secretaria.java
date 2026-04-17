package ejercicio_01;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Secretaria {
    private List<Alumno> alumnos;

    public Secretaria(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    // 1. Obtener todos los alumnos de la lista usando filter.
    // Usamos filter(a -> true) para cumplir estrictamente con el enunciado.
    public List<Alumno> obtenerTodosConFilter() {
        return alumnos.stream()
                .filter(a -> true)
                .collect(Collectors.toList());
    }

    // 2. Mostrar todos los alumnos imprimiéndolos con forEach().
    public void imprimirTodos() {
        alumnos.stream()
                .forEach(System.out::println);
    }

    // 3. Imprimir todos los alumnos cuyo nombre empiece con una letra determinada.
    public void imprimirPorLetraInicial(String letra) {
        alumnos.stream()
                .filter(a -> a.getNombre().toLowerCase().startsWith(letra.toLowerCase()))
                .forEach(System.out::println);
    }

    // 4. Dar el tamaño de la lista usando count().
    public long obtenerTamano() {
        return alumnos.stream().count();
    }

    // 5. Obtener los alumnos con nota media mayor de 9 en el curso 1DAM.
    public List<Alumno> obtenerSobresalientes1DAM() {
        return alumnos.stream()
                .filter(a -> a.getNotaMedia() > 9 && a.getNombreCurso().equalsIgnoreCase("1DAM"))
                .collect(Collectors.toList());
    }

    // 6. Imprimir los 3 primeros alumnos de la lista usando limit().
    public void imprimirTresPrimeros() {
        alumnos.stream()
                .limit(3)
                .forEach(System.out::println);
    }

    // 7. Obtener el alumno de menor edad.
    // Retorna Optional por si la lista estuviera vacía.
    public Optional<Alumno> obtenerAlumnoMenorEdad() {
        return alumnos.stream()
                .min(Comparator.comparingInt(Alumno::getEdad));
    }

    // 8. Obtener el primer alumno de la lista con findFirst().
    public Optional<Alumno> obtenerPrimerAlumno() {
        return alumnos.stream()
                .findFirst();
    }

    // 9. Obtener una nueva lista con los alumnos cuya longitud de su nombre sea mayor a 10 letras.
    public List<Alumno> obtenerAlumnosNombreLargo() {
        return alumnos.stream()
                .filter(a -> a.getNombre().length() > 10)
                .collect(Collectors.toList());
    }

    // 10. Obtener los alumnos que empiecen por la letra A y la longitud de su nombre sea menor o igual a 6.
    public List<Alumno> obtenerAlumnosEmpiezanPorAYCortos() {
        return alumnos.stream()
                .filter(a -> a.getNombre().toUpperCase().startsWith("A") && a.getNombre().length() <= 6)
                .collect(Collectors.toList());
    }
}
