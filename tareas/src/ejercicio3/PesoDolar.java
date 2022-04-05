/*Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 04 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Solicita 1 numero (cantidad de pesos) al usuario, lo convierte a dolares y lo imprime
 */
package ejercicio3;

public class PesoDolar {
	private float peso;
	private float dolar = 19.81f;// 0.050
	private float resul;

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getDolar() {
		return dolar;
	}

	public void setDolar(float dolar) {
		this.dolar = dolar;
	}

	public float getResul() {
		return resul = peso / dolar;
	}

	public void setResul(float resul) {
		this.resul = resul;
	}

}
