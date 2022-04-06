/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 04 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Convierte una cantidad de kb a mb
 */
package ejercicio11;

import java.util.Scanner;

public class Principal {
	static KbaMb kb;
	static Scanner s;

	public static void main(String[] args) {
		kb = new KbaMb();
		s = new Scanner(System.in);
		System.out.print("ingrese la cantidad de Kb a convertir: ");
		kb.setKb(s.nextDouble());
		System.out.println("\nSu cantidad en Mb es: " + kb.Resul());

	}

}