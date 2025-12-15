package ejercicio_02;

public class Documento {

	private String nombre_Institucion;
	private String logo;
	
	public Documento(String nombre_Institución, String logo) {
		this.nombre_Institucion = nombre_Institución;
		this.logo = logo;
	}

	public String getNombre_Institución() {
		return nombre_Institucion;
	}

	public void setNombre_Institución(String nombre_Institución) {
		this.nombre_Institucion = nombre_Institución;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
	public void imprimirCabecera() {
        System.out.println("------------------------------------------");
        System.out.printf("%s\t\t%s\n",nombre_Institucion, logo);
        System.out.println("------------------------------------------");
    }
	
	
}
