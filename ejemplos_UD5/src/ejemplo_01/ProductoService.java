package ejemplo_01;

import java.util.HashSet;
import java.util.Set;

public class ProductoService {

	private Set<Producto> productos = new HashSet <> ();
	//CREATE
	public boolean addProducto (Producto p) {
		return productos.add(p);
	}
	
	// READ
	public Set<Producto> getProductos() {
		return productos;
	}
	
	// UPDATE
	public boolean updateProducto (Producto p) {
		if (productos.contains(p)) {
			productos.remove(p);
			productos.add(p);
			return true;
		}
		return false;
	}
	
	// DELETE
	public boolean deleteProducto (Producto p) {
		return productos.remove(p);
	}
	
	
}
