package ejercicio_04;

public class Gimnasio {

	Cliente lista_Cliente [] = new Cliente [100];

	
	public Gimnasio(Cliente[] lista_Cliente) {
		
		this.lista_Cliente = lista_Cliente;
	}
	
	public void mostrarNoActivo () {
		
		int cont=0;
		
		for (int i = 0; lista_Cliente[i] != null; i++) {
			
			if (lista_Cliente[i].isActivo() == false) {
				
				System.out.printf("\nID %d - %s %s NO ACTIVO", (i+1), lista_Cliente[i].nombre, lista_Cliente[i].apellidos);
				cont++;
			}
			
		}
		
		if (cont == 0) {
			
			mensajeError();
			
		}
		
	}
	
	public double calcularMediaIMC () {
		
		double sum = 0;
		int cont = 0;
		for (int i = 0; lista_Cliente[i] != null; i++) {
			
			if (lista_Cliente[i].isActivo()) {
				
				sum = sum + lista_Cliente[i].calcularIMC(lista_Cliente[i].getPeso(), lista_Cliente[i].getAltura());
				cont++;
			}
			
			
		}
		
		if (cont == 0) {
			
			return 0;
			
		} else {
			
			return sum/cont;
			
		}
	}	
	public void darDeBaja (int id) {
		
		lista_Cliente[id].setActivo(false);
		
	}
	
	public void mensajeError () {
		
		System.err.println("\nERROR - No se encontraron resultados para su búsqueda.");
		
	}
	
	public void findByID (int id) {
		
		if (lista_Cliente[id] == null) {
			
			mensajeError();
			
		} else {
			
		System.out.printf("\nID %d - %s %s", (id+1), lista_Cliente[id].nombre, lista_Cliente[id].apellidos);
		
		}
	}
	
	public void findByNombre (String nombre) {
		
		int cont=0;
		
		for (int i = 0; lista_Cliente[i] != null; i++) {
			
			if(lista_Cliente[i].getNombre().equals(nombre)) {
				
				System.out.printf("\nID %d - %s %s", (i+1), lista_Cliente[i].nombre, lista_Cliente[i].apellidos);
				cont++;
			}
			
		}
		
		if (cont == 0) {
			
			mensajeError();
			
		}
		
	}
	
	public void findByApellido (String apellido) {
		
		int cont=0;
		
		for (int i = 0; lista_Cliente[i] != null; i++) {
			
			if(lista_Cliente[i].getApellidos().equals(apellido)) {
				
				System.out.printf("\nID %d - %s %s", (i+1), lista_Cliente[i].nombre, lista_Cliente[i].apellidos);
				cont++;
			}
			
		}
		
		if (cont == 0) {
			
			mensajeError();
			
		}
		
	}
	
	public void findByDNI (String dni) {
		
		int cont=0;
		
		for (int i = 0; lista_Cliente[i] != null; i++) {
			
			if(lista_Cliente[i].getDni().equals(dni)) {
				
				System.out.printf("\nID %d - %s %s", (i+1), lista_Cliente[i].nombre, lista_Cliente[i].apellidos);
				cont++;
			}
			
		}
		
		if (cont == 0) {
			
			mensajeError();
			
		}
		
	}
	
}