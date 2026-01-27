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
	//NO SE LE PASAN LOS ATRIBUTOS SUELTOS A AGREGAR
	public void agregarSocio(Socio s) {
		lista_Socios.add(s);
	}
	//SEGUNDA VERSION PARA AGREGAR SOCIOS
	public boolean agregarSocioV2(Socio s) {
	
		return lista_Socios.add(s);
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

	public boolean borrarSocio(String id) {
		Socio s = buscarSocio(id);
		if (s != null) {
			lista_Socios.remove(s);
			return true;
		} else {
			return false;
		}
	}
	public void mostrarTodos() {
		for (int i = 0; i < lista_Socios.size(); i++) {
			System.out.println(lista_Socios.get(i).toString());
		}
	}
	public void mostrarTodosV2() {
		for (Socio s : lista_Socios) {
			System.out.println(s);
		}
		
	}
	
}