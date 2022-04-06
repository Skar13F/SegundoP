/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 05 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Calcula el volumen de un cono 
 */
package ejercicio9;

import java.util.Scanner;

public class Principal {
	static Scanner s;
	static VolumenCono vol;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		vol = new VolumenCono();
		System.out.print("Dame el valor del radio: ");
		vol.setRadio(s.nextDouble());
		System.out.print("Dame el valor de la altura: ");
		vol.setAltura(s.nextDouble());
		System.out.print("El volumen del cono es de " + vol.Volumen() + " u³");

	}

}
