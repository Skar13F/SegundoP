/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 06 de abril de 2022
 * Fecha de actualización: 06 de abril
 * Descripción: Calcula el precio de un producto, con iva y aplica un descuento
 */
package ejercicio12;

public class Producto {
	private float iva;
	private float descuento;
	private float precio;

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float Iva() {
		return iva * precio + precio;
	}

	public float Descuento() {
		if (descuento < 1) {
			return Iva() - descuento * Iva();
		} else {
			return Iva() - descuento;
		}
	}
}
