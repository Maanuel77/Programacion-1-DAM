package ejercicio;

import java.util.Arrays;

public class GestionFamiliar {

	private Hijo [] lista;
	private double presupuesto_Total;
	
	public GestionFamiliar(Hijo[] lista, double presupuesto_Total) {
		super();
		this.lista = lista;
		this.presupuesto_Total = presupuesto_Total;
	}
	public Hijo[] getLista() {
		return lista;
	}
	public void setLista(Hijo[] lista) {
		this.lista = lista;
	}
	public double getPresupuesto_Total() {
		return presupuesto_Total;
	}
	public void setPresupuesto_Total(double presupuesto_Total) {
		this.presupuesto_Total = presupuesto_Total;
	}
	@Override
	public String toString() {
		return "GestionFamiliar [lista=" + Arrays.toString(lista) + ", presupuesto_Total=" + presupuesto_Total + "]";
	}
	
	//NUNCA LLAMAR AÑADIR CON Ñ
	//DE NINGUNA DE LAS MANERAS PONER UN PRINTLN DENTRO DEL AGREGAR NO SE IMPRIME EN LOS MÉTODOS
	//PARA MI YO DEL FUTURO, NO PONGAS UN CONTADOR DENTRO DEL MÉTODO PORQUE SIEMPRE SE VA A ESTAR REINCIANDO
	public void agregar (Hijo h, int cont) {
		lista [cont] = h;
		
	}
	//V1
	public Hijo findById (int id) {
		
		int i = 0;
		boolean encontrado = false;
		//MIENTRAS NO HAYAMOS ENCONTRADO EL HIJO CON EL ID O LLEGADO AL FINAL SERÁ FALSE
		
		while (i < lista.length && !encontrado) {
			
			if (lista[i].getId()== id)
				encontrado = true;
			else 
				i++;
		}
		
		if (encontrado)
			return lista [i];//DEVOLVEMOS EL PRODUCTO BUSCADO
		else
			return null;
	}
	//V2
	
    public Hijo findByIdV2(int id, int cant) {
        for (int i = 0; i < cant; i++) {
            if (lista[i].getId() == id) {
                return lista[i];
            }
        }
        return null;
    }
	
    public double calcularTotalMayores (int edad, int cant_Horas, double porc) {
    	
    	double suma = 0;
    	
    	for (int i = 0; i < lista.length; i++) {
    		
    		suma = suma + lista [i].calcular_Paga(cant_Horas, porc);
    		
    	}
    	return suma;
    }
    
    public double calcularPresupuesto (int ID) {
    	
    	
    	
    }
    
}
