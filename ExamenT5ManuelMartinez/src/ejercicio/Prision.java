package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Prision {

    private int id;
    private String nombre;
    private int capacidadMax;
    private List<Preso> listaPresos;


    public Prision(int id, String nombre, int capacidadMax) {
        this.id = id;
        this.nombre = nombre;
        this.capacidadMax = capacidadMax;
        this.listaPresos = new ArrayList<Preso>(); 
    }

    
    public String getNombre() {
        return nombre;
    }


    public boolean agregarPreso(Preso p) {
        if (listaPresos.size() < capacidadMax) {
            return listaPresos.add(p);
        }
        return false;
    }

    public void mostrarTodosLosPresos() {
        Iterator<Preso> it = listaPresos.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public Preso findByDni(String dni) {
        for (Preso p : listaPresos) {
            if (p.getDni().equalsIgnoreCase(dni)) {
                return p;
            }
        }
        return null;
    }

    public boolean indultarPreso(String dni) {
        Preso p = findByDni(dni);
        if (p != null) {
            p.setDiasCondena(0);
            return true;
        }
        return false;
    }

    public List<Preso> findMenosXDias(int maxDias, int diasExtraSangre) {
        List<Preso> filtrados = new ArrayList<>();
        for (Preso p : listaPresos) {
            if (p.calcularDiasFinales(diasExtraSangre) < maxDias) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public double calcularMedia(int diasExtraSangre) {
        double totalDias = 0;
        int cont = 0;
        
        for (Preso p : listaPresos) {
            if (p.isDelitoSangre()) {
                p.setDiasCondena(p.calcularDiasFinales(diasExtraSangre));
                totalDias = totalDias + p.getDiasCondena();
                cont++;
            }
        }
        
        if (cont == 0) return 0;
        return totalDias / cont;
    }

    public void ordenarPresosPorCondenaNatural() {
        Collections.sort(listaPresos);
    }

    public void ordenarPresosPorNombreNoNatural() {
        Collections.sort(listaPresos, new Comparator<Preso>() {
            @Override
            public int compare(Preso p1, Preso p2) {
                return p1.getNombre().compareToIgnoreCase(p2.getNombre());
            }
        });
    }
}
	

