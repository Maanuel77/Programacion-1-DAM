package ejercicio;

import utilidades.Leer;

public class Principal {
    public static void main(String[] args) {
    	
    	double plus_Anio_Trabajado, incentivo, irpf, bruto, neto, total_Ayudantes, total_Nominas;
    	int limite_Horas, idx, opcion;
        String aviso = null;
        
        
    
        Trabajador[] trabajador = new Trabajador[4];

        trabajador[0] = new Trabajador(1, "Manuel (Genérico)", 1000, 5);
        
        trabajador[1] = new Ayudante(2, "Gonzalo (Ayudante)", 900, 2, 10);

        trabajador[2] = new Ayudante(3, "German (Explotado)", 900, 1, 50);

        trabajador[3] = new Chef(4, "Maria (Chef)", 1500, 10, "Italiana", 20);

        Restaurante miRestaurante = new Restaurante("El Dios de la Comida", trabajador);
        
        
        
        System.out.println("Bienvenido a mi menú del restaurante, espero que le guste :)");

        System.out.println("--- CONFIGURACIÓN DE PAGOS ---");
        
        System.out.print("Introduce el plus por año trabajado (€): ");
        plus_Anio_Trabajado = Leer.datoDouble();

        
        System.out.print("Introduce el precio incentivo (Hora Extra / Plato): ");
        incentivo = Leer.datoDouble();
        
        System.out.print("Introduce el porcentaje de IRPF para desglosar (%): ");
        irpf = Leer.datoDouble();

        System.out.print("Introduce límite de horas extra para alerta de Ayudantes: ");
        limite_Horas = Leer.datoInt();
        
        do {
        	
        	System.out.println("-----MENU DEL RESTAURANTE-----");
        	System.out.println("1. Mostrar datos de trabajadores");
        	System.out.println("2. Calcular sueldo de un trabajador");
        	System.out.println("3. Total gastado solo en ayudantes");
        	System.out.println("4. Total gasto en nóminas (bruto)");
        	System.out.println("0. Salir del menú");
        	opcion = Leer.datoInt();
        	
        	switch (opcion) {
        	
        	
        		case 1: 
        			
        			System.out.println("\n--- 1. MOSTRAR DATOS DE TRABAJADORES ---");
        	        Trabajador[] lista = miRestaurante.get_Lista_Trabajadores();
        	        
        	        for (Trabajador t : lista) {
        	            if (t instanceof Ayudante) {
        	                if( ((Ayudante) t).comprobar_Horas_Extra(limite_Horas)) {
        	                	
        	                	aviso = "Aviso, horas máximas sobrepasadas";
        	                	
        	                } else {
        	                
        	                	aviso = "";
        	                
        	                }
        	                }
        	            System.out.println(t.toString() + aviso);
        	        }
        	        break;
        	       
        		case 2: 
        			
        			System.out.println("\n--- 2. CALCULAR SUELDO DE UN TRABAJADOR ---");
        	        System.out.print("Elige índice del trabajador (0-3): ");
        	        idx = Leer.datoInt();
        	        
        	        Trabajador tSeleccionado = miRestaurante.get_Trabajador(idx);
        	        if (tSeleccionado != null) {
        	        	bruto = miRestaurante.get_Sueldo_Trabajador(idx, plus_Anio_Trabajado, incentivo);
        	        	neto = tSeleccionado.calcular_Sueldo_Neto(bruto, irpf);
        	            
        	            System.out.println("Nómina de: " + tSeleccionado.getNombre());
        	            System.out.println(" -> Bruto: " + bruto + "€");
        	            System.out.println(" -> Neto (tras " + irpf + "% imp): " + neto + "€");
        	        }
        			break;
        			
        		case 3:
        			
        			System.out.println("\n--- 3. TOTAL GASTADO SOLO EN AYUDANTES (Bruto) ---");
        	        total_Ayudantes = miRestaurante.calcular_Total_Solo_Ayudantes(plus_Anio_Trabajado, incentivo);
        	        System.out.println("Total Ayudantes: " + total_Ayudantes + "€");
        	        
        	        break;
        	        
        		case 4: 
        			
        			 System.out.println("\n--- 4. GASTO TOTAL EN NÓMINAS (Bruto) ---");
        		        total_Nominas = miRestaurante.calcular_Nomina_Total(plus_Anio_Trabajado, incentivo);
        		        System.out.println("Total Restaurante: " + total_Nominas + "€");
        		        break;
        		        
        		case 0:
        			
        			System.out.println("Gracias por usar el menú, que tenga un buen día :)");
        			break;
        			
        		default:
        			
        			System.out.println("Número introducido inválido o fuera de rango, modifíquelo");
        			
        	}
        	
        }while (opcion != 0);
    }
}
