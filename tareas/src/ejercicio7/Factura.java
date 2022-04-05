/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 05 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Calcula el total de una factura 
 */
package ejercicio7;

public class Factura {
	private float subtotal;
	private float iva = 0.16f;

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public float Total() {
		return subtotal + (subtotal * iva);
	}

}
