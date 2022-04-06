/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 05 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Calcula el volumen de un cono 
 */
package ejercicio9;

public class VolumenCono {
	private double radio;
	private double altura;
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double Volumen() {
		double pi=3.1416;
		return (pi*radio*radio*altura)/3;
	}

}
