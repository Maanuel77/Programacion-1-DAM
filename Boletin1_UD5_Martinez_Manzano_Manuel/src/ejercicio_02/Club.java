package ejercicio_02;

import java.util.ArrayList;

public class Club {
	
	private String nombre;
	private ArrayList<Socio> lista_Socios;
	public Club(String nombre) {
		this.nombre = nombre;
		this.lista_Socios = new ArrayList<Socio>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Socio> getLista_Socios() {
		return lista_Socios;
	}

	public void setLista_Socios(ArrayList<Socio> lista_Socios) {
		this.lista_Socios = lista_Socios;
	}

	public void agregarSocio(Socio s) {
		lista_Socios.add(s);
	}

	public Socio buscarSocio(String id) {
		
		for (int i = 0; i < lista_Socios.size(); i++) {
			Socio s = lista_Socios.get(i);
			if (s.getId().equals(id)) {
				return s;
			}
		}
		
		return null;
	}

	public void borrarSocio(String id) {
		Socio s = buscarSocio(id);
		if (s != null) {
			lista_Socios.remove(s);
			System.out.println("Socio borrado correctamente.");
		} else {
			System.out.println("No se puede borrar: El socio no existe.");
		}
	}
	public void mostrarTodos() {
		for (int i = 0; i < lista_Socios.size(); i++) {
			System.out.println(lista_Socios.get(i).toString());
		}
	}
}