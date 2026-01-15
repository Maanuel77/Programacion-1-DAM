package ejemplo_interfaces;

public class Rana extends Anfibios implements IPresa, IDepredador{

	@Override
	public void cazar(boolean en_Grupo) {
		// TODO Auto-generated method stub
		
		if (en_Grupo) {
			
			System.out.println("Todos juntos");
			
		}else {
			
			System.out.println("Yo me lo guiso yo me lo como");
			
		}
		
	}

	@Override
	public void perseguir() {
		// TODO Auto-generated method stub
		
		System.out.println("Persiguiendo....");
		
	}

}
