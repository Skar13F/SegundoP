/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 04 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Convierte una cantidad de mb a kb
 */
package ejercicio10;

import java.util.Scanner;

public class Principal {
	static MbaKb mb;
	static Scanner s;

	public static void main(String[] args) {
		mb = new MbaKb();
		s = new Scanner(System.in);
		System.out.print("ingrese la cantidad de Mb a convertir: ");
		mb.setMb(s.nextDouble());
		System.out.println("Su cantidad en Kb es: " + mb.Resul());

	}

}