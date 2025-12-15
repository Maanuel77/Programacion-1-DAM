package ejercicio_02_V2;


public class Empresa {

	private String nombre;
	private String CIF;
	public Empresa(String nombre, String cIF) {
		super();
		this.nombre = nombre;
		CIF = cIF;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	
	
	
}
