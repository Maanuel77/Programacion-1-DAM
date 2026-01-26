package ejercicio_02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		Club miClub = new Club("Club de Campo");
		

		String nombre, id, DNI, lecturaTeclado;
		boolean activo, vip;
		double cuota_Base;
		int antiguedad;
		String continuar;

		Socio s1 = new Socio("Pepe", "111", "12345A", true, false, 50, 2);
		Socio s2 = new Socio("Ana", "222", "98765B", true, true, 50, 5);
		miClub.agregarSocio(s1);
		miClub.agregarSocio(s2);
		
		
		System.out.println("--- ALTA DE NUEVOS SOCIOS ---");
		
		do {
			System.out.println("\nIntroduce los datos del nuevo socio:");
			
			System.out.print("Nombre: ");
			nombre = Leer.dato();
			
			System.out.print("ID: ");
			id = Leer.dato();
			
			System.out.print("DNI: ");
			DNI = Leer.dato();
			
			System.out.print("¿Está activo? (s/n): ");
			lecturaTeclado = Leer.dato();
			if (lecturaTeclado.equalsIgnoreCase("s")) {
				activo = true;
			} else {
				activo = false;
			}
			
			System.out.print("¿Es VIP? (s/n): ");
			lecturaTeclado = Leer.dato();

			if (lecturaTeclado.equalsIgnoreCase("s")) {
				vip = true;
			}else {
				vip = false;
			}
			
			System.out.print("Cuota Base (decimales con punto): ");
			
			cuota_Base = Leer.datoDouble();
			
			System.out.print("Años de antigüedad: ");
			antiguedad = Leer.datoInt();
			
			Socio nuevoSocio = new Socio(nombre, id, DNI, activo, vip, cuota_Base, antiguedad);
			miClub.agregarSocio(nuevoSocio);
			System.out.println("--> Socio " + nombre + " guardado correctamente.");
			
			System.out.println("\n¿Quieres añadir otro socio? (s/n)");
			continuar = Leer.dato();
			
		} while (continuar.equalsIgnoreCase("s"));
		
		
		System.out.println("\n-- LISTA ACTUAL DE SOCIOS --");
		miClub.mostrarTodos();
		
		
		System.out.println("\n-- BUSCAR Y MODIFICAR SOCIO --");
		System.out.print("Introduce el ID del socio a buscar: ");
		String idBuscar = Leer.dato();
		
		Socio encontrado = miClub.buscarSocio(idBuscar);
		
		if (encontrado != null) {
			System.out.println("Socio encontrado: " + encontrado.getNombre());
			System.out.println("Datos actuales: " + encontrado.toString());
			
			System.out.println("Introduce el nuevo nombre para este socio:");
			String nuevoNombre = Leer.dato();
			
			encontrado.setNombre(nuevoNombre);
			System.out.println("Nombre modificado con éxito. Nuevo nombre: " + encontrado.getNombre());
		} else {
			System.out.println("El socio con ID " + idBuscar + " no existe.");
		}

		
		System.out.println("\n-- BORRAR UN SOCIO --");
		System.out.print("Introduce el ID del socio a borrar: ");
		String idBorrar = Leer.dato();
		
		miClub.borrarSocio(idBorrar);
		
		System.out.println("\n-- LISTA FINAL --");
		miClub.mostrarTodos();

	}

}