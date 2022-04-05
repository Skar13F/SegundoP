/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 05 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: clase Conversor, definimos 2 variables de tipo float
 * 				creamos un metodo convert, realizamos la multiplicacion y luego lo imprimimos
 */
package ejercicio2;

public class Conversor {
	private float dollar;
	private float pesos = 19.81f;

	public float getDollar() {
		return dollar;
	}

	public void setDollar(float dollar) {
		this.dollar = dollar;
	}

	public float getPesos() {
		return pesos;
	}

	public void setPesos(float pesos) {
		this.pesos = pesos;
	}

	public void Convert() {
		float convert = dollar * pesos;
		System.out.println("La cantidad en pesos es de: " + convert);
	}

}
