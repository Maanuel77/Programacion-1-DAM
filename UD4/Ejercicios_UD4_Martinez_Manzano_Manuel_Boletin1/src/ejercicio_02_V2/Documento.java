package ejercicio_02_V2;

public class Documento{



	
	
	public Documento() {
		super();
	}

	public void imprimirCabecera(Empresa e) {
        System.out.println("------------------------------------------");
        System.out.printf("%s\t\t%s\n",e.getNombre(),e.getCIF());
        System.out.println("------------------------------------------");
    }
	
	
}
