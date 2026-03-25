package ejercicio_04;

public class Principal {

	public static void main(String[] args) {
		  
	        Agenda miAgenda = new Agenda();

	        Contacto c1 = new Contacto("Marta");
	        Contacto c2 = new Contacto("Pedro");
	        Contacto c3 = new Contacto("Lucia");

	        // 1. Agregar
	        miAgenda.agregar(c1, "600123456");
	        miAgenda.agregar(c2, "611987654");
	        miAgenda.agregar(c3, "622444555");
	        System.out.println("Contactos agregados correctamente.\n");

	        // 2. Mostrar
	        System.out.println("--- LISTA DE CONTACTOS ---");
	        System.out.print(miAgenda.mostrar());
	        System.out.println("--------------------------\n");

	        // 3. Buscar
	        String nombreBuscar = "Pedro";
	        String telefonoEncontrado = miAgenda.buscarPorNombre(nombreBuscar);
	        if (telefonoEncontrado != null) { 
	            System.out.println("Búsqueda: El teléfono de " + nombreBuscar + " es " + telefonoEncontrado);
	        } else {
	            System.out.println("Búsqueda: No se encontró a " + nombreBuscar);
	        }

	        // 4. Modificar
	        System.out.println("\nModificando el número de Marta...");
	        if (miAgenda.modificar(c1, "699000111")) {
	            System.out.println("Modificación exitosa.");
	        } else {
	            System.out.println("Error: El contacto no existe.");
	        }

	        // 5. Borrar
	        System.out.println("\nBorrando a Pedro...");
	        if (miAgenda.borrar(c2)) {
	            System.out.println("Contacto borrado exitosamente.");
	        } else {
	            System.out.println("Error al borrar: El contacto no existe.");
	        }

	        // Mostrar final para verificar
	        System.out.println("\n--- LISTA FINAL ---");
	        System.out.print(miAgenda.mostrar());
	    
	}

}
