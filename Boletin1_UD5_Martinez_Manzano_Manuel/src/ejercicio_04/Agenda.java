package ejercicio_04;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    
    private HashMap<Contacto, String> directorio;

    public Agenda() {
        this.directorio = new HashMap<>();
    }

    // Agrega o actualiza un contacto
    public void agregar(Contacto contacto, String telefono) {
        directorio.put(contacto, telefono);
    }

    // Devuelve true si lo borró, false si no existía
    public boolean borrar(Contacto contacto) {
        return directorio.remove(contacto) != null;
    }
    // Devuelve el contacto asociado a ese teléfono, o null si no lo encuentra
    public Contacto findByTelefV2 (String telefono) {
		for (Map.Entry<Contacto, String> entrada : directorio.entrySet()) {
			if (entrada.getValue().equals(telefono)) {
				return entrada.getKey();
			}
		}
		return null; // No se encontró ningún contacto con ese teléfono
	}
    
    // Devuelve un String con todos los contactos formateados
    public String mostrar() {
        if (directorio.isEmpty()) {
            return "La agenda está vacía.";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Contacto, String> entrada : directorio.entrySet()) {
            sb.append(entrada.getKey().getNombre()).append(" - ").append(entrada.getValue()).append("\n");
        }
        return sb.toString();
    }

    
    // Devuelve el número de teléfono, o null si no lo encuentra
    public String buscarPorNombre(String nombre) {
        Contacto contactoFicticio = new Contacto(nombre);
        return directorio.get(contactoFicticio);
    }

    // Devuelve true si se pudo modificar, false si el contacto no existe
    public boolean modificar(Contacto contacto, String nuevoTelefono) {
        if (directorio.containsKey(contacto)) {
        	// No se puede usar put ya que crea un nuevo contacto cambiándole el id.
            directorio.put(contacto, nuevoTelefono); 
            return true;
        }
        return false;
    }
    

}