package ejercicio_03;

import utilidades.Leer;

public class Principal {
    public static void main(String[] args) {
        
        int opcion;
        String dni_Buscado, nombre_Nuevo;
        double nota_Nueva;

        GestionClase miClase = new GestionClase("1º DAM / DAW");
        
        // Añadimos un par de alumnos iniciales para tener datos de prueba
        miClase.agregar_Alumno(new Alumno("111A", "Juan Pérez", 6.5));
        miClase.agregar_Alumno(new Alumno("222B", "Ana Gómez", 3.2));
        miClase.agregar_Alumno(new Alumno("333C", "Luis Explotado", 4.0));
        miClase.agregar_Alumno(new Alumno("444D", "María Sobresaliente", 9.5));

        System.out.println("Bienvenido al gestor de la clase :)");

        do {
            System.out.println("\n MENÚ DE LA CLASE ");
            System.out.println("1. Mostrar todos los alumnos");
            System.out.println("2. Mostrar un alumno específico (por DNI)");
            System.out.println("3. Modificar nota de un alumno");
            System.out.println("4. Borrar un alumno");
            System.out.println("5. Ver estadísticas del curso (Medias y Suspensos)");
            System.out.println("0. Salir del menú");
            System.out.print("Elige una opción: ");
            
			opcion = Leer.datoInt();
			
            switch (opcion) {
                case 1:
                    System.out.println("\n 1. LISTA DE ALUMNOS ");
                    miClase.mostrar_Todos();
                    break;
                   
                case 2:
                    System.out.println("\n--- 2. MOSTRAR ALUMNO INDIVIDUAL ---");
                    System.out.print("Introduce el DNI del alumno: ");
                    dni_Buscado = Leer.dato();
                    
                    Alumno a_Mostrar = miClase.buscar_Alumno(dni_Buscado);
                    if (a_Mostrar != null) {
                        System.out.println(a_Mostrar.toString());
                    } else {
                        System.out.println("No se ha encontrado ningún alumno con ese DNI.");
                    }
                    break;
                    
                case 3:
                    System.out.println("\n--- 3. MODIFICAR ALUMNO ---");
                    System.out.print("Introduce el DNI del alumno a modificar: ");
                    dni_Buscado = Leer.dato();
                    
                    Alumno a_Modificar = miClase.buscar_Alumno(dni_Buscado);
                    if (a_Modificar != null) {
                        System.out.println("Alumno actual: " + a_Modificar.toString());
                        System.out.print("Introduce la nueva nota: ");
                        nota_Nueva = Leer.datoDouble();
                        
                        a_Modificar.setNota(nota_Nueva);
                        System.out.println("¡Nota modificada con éxito!");
                    } else {
                        System.out.println("No se ha encontrado ningún alumno con ese DNI.");
                    }
                    break;
                    
                case 4:
                    System.out.println("\n--- 4. BORRAR ALUMNO ---");
                    System.out.print("Introduce el DNI del alumno a borrar: ");
                    dni_Buscado = Leer.dato();
                    
                    if (miClase.borrar_Alumno(dni_Buscado)) {
                        System.out.println("Alumno borrado del sistema correctamente.");
                    } else {
                        System.out.println("No se pudo borrar. El DNI no existe en el registro.");
                    }
                    break;
                    
                case 5:
                    System.out.println("\n--- 5. ESTADÍSTICAS DEL CURSO ---");
                    System.out.println("Nota media general del curso: " + miClase.calcular_Media_Curso());
                    System.out.println("Número total de suspensos: " + miClase.get_Total_Suspensos());
                    System.out.println("Nota media de los suspensos: " + miClase.calcular_Media_Suspensos());
                    break;
                    
                case 0:
                    System.out.println("Gracias por usar el gestor de clase. ¡Que tengas un buen día! :)");
                    break;
                    
                default:
                    System.out.println("Número introducido inválido o fuera de rango, modifíquelo.");
            }
            
        } while (opcion != 0);
        
    }
}