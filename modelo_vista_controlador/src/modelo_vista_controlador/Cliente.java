package modelo_vista_controlador;

public class Cliente {

    private Long id_Cliente;
    private String nombre;
    private String email;
    private String telefono;

    public Cliente() {
    }

    public Long getId() {
        return id_Cliente;
    }

    public void setId(Long id) {
        this.id_Cliente = id;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

    
}
