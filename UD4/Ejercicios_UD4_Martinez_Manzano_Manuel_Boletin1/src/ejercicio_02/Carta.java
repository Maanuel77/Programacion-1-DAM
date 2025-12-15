package ejercicio_02;

public class Carta extends Documento{

	private String fecha;

	public Carta(String nombre_Institución, String logo, String fecha) {
		super(nombre_Institución, logo);
		this.fecha = fecha;
	}
	
	public void imprimirCabecera() {
        System.out.println("------------------------------------------");
        System.out.printf("%s\t\t%s\n",super.getNombre_Institución(), super.getLogo());
        System.out.println("------------------------------------------");
        System.out.println("FECHA: "+fecha);
    }
	
}
