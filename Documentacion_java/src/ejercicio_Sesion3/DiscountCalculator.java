package ejercicio_Sesion3;

/**
 * 
 * Class for different methods with the objective of calculate
 * different types of discounts by different forms.
 * 
 */

public class DiscountCalculator {

	/**
	 * Method to calculate the specific discount for a product, you only can calculate
	 * the discount one by one. The utility for multiple discounts is not available
	 * for the moment
	 * 
	 * @param precio
	 * @param porcentaje
	 * @return final price with the discount
	 */
	
	public double aplicarDescuento(double precio, double porcentaje) {
	       return precio - (precio * porcentaje / 100);
	   }

	
}
