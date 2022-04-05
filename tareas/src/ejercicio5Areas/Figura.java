/*Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 05 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Calcula el área de una figura introduciendo la base y la altura
 */
package ejercicio5Areas;

public abstract class Figura {
	private float base;
	private float altura;

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float Area() {
		return 0;
	}

}
