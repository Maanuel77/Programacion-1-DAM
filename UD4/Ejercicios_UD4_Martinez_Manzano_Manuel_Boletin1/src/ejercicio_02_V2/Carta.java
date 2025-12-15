package ejercicio_02_V2;

public class Carta extends Documento{

	private String fecha;

	public Carta(String nombre, String CIF, String fecha) {
		super(nombre, CIF);
		this.fecha = fecha;
	}

	
}
