package ejercicio_02_V2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre_Institucion = "Colegio Salesianos de San Pedro", logo = "CSSP", datos_de_empresa="Angel Naranjo Company", fecha = "12/12/2025";
		
		Documento d = new Documento (nombre_Institucion,logo);
		Carta c = new Carta (nombre_Institucion,logo, fecha);
		Tarjeta_de_visita t = new Tarjeta_de_visita(nombre_Institucion, logo, datos_de_empresa);
		
		d.imprimirCabecera();
		c.imprimirCabecera();
		t.imprimirCabecera();
		
		
	}

}
