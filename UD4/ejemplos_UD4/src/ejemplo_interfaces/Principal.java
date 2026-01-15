package ejemplo_interfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//IDepredador predator = new IDepredador (); No se puede instanciar por ser abstracta
		
		Anfibios a = new Anfibios ();
		
		Rana r = new Rana ();
		
		r.cazar(false);
		r.perseguir();
	}

}
