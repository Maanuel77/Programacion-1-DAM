package ejercicio_01;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Datos de prueba
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Ana", "García", "1DAM", 9.5, 18));
        listaAlumnos.add(new Alumno("Maximiliano", "López", "2DAM", 7.0, 20));
        listaAlumnos.add(new Alumno("Alberto", "Pérez", "1DAM", 8.5, 19));
        listaAlumnos.add(new Alumno("Juan", "Díaz", "1DAM", 9.8, 17));
        listaAlumnos.add(new Alumno("Alejandrina", "Ruiz", "1DAW", 6.0, 22));
        
        Secretaria secretaria = new Secretaria(listaAlumnos);

        System.out.println("--- 1. Todos los alumnos (usando filter) ---");
        secretaria.obtenerTodosConFilter().forEach(System.out::println);

        System.out.println("\n--- 2. Imprimir todos (usando forEach) ---");
        secretaria.imprimirTodos();

        System.out.println("\n--- 3. Empiezan por 'M' ---");
        secretaria.imprimirPorLetraInicial("M");

        System.out.println("\n--- 4. Tamaño de la lista (count) ---");
        System.out.println("Total: " + secretaria.obtenerTamano());

        System.out.println("\n--- 5. Nota > 9 en 1DAM ---");
        secretaria.obtenerSobresalientes1DAM().forEach(System.out::println);

        System.out.println("\n--- 6. Tres primeros alumnos (limit) ---");
        secretaria.imprimirTresPrimeros();

        System.out.println("\n--- 7. Alumno de menor edad ---");
        secretaria.obtenerAlumnoMenorEdad().ifPresent(System.out::println);

        System.out.println("\n--- 8. Primer alumno (findFirst) ---");
        secretaria.obtenerPrimerAlumno().ifPresent(System.out::println);

        System.out.println("\n--- 9. Nombre con más de 10 letras ---");
        secretaria.obtenerAlumnosNombreLargo().forEach(System.out::println);

        System.out.println("\n--- 10. Empiezan por 'A' y longitud <= 6 ---");
        secretaria.obtenerAlumnosEmpiezanPorAYCortos().forEach(System.out::println);
    }
}