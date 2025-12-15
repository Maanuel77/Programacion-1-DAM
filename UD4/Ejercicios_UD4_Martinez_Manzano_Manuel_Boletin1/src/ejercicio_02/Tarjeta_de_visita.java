package ejercicio_02;

public class Tarjeta_de_visita extends Documento{

	
	private String datos;
	
	public Tarjeta_de_visita(String nombre_Institución, String logo, String datos) {
		super(nombre_Institución, logo);
		this.datos = datos;
	}

	public void imprimirCabecera() {
        System.out.println("------------------------------------------");
        System.out.printf("%s\t\t%s\n",super.getNombre_Institución(), super.getLogo());
        System.out.println("------------------------------------------");
        System.out.println("DATOS DIRECTOR: "+datos);
    }
}
