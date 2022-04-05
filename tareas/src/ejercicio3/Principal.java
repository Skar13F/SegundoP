/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 04 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Convierte una cantidad de pesos a dolares
 */
package ejercicio3;

import java.util.Scanner;

public class Principal {
	static PesoDolar pD = new PesoDolar();
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("ingrese la cantidad de pesos a convertir: ");
		pD.setPeso(s.nextFloat());
		System.out.print("Su cantidad en dolares es: " + pD.getResul());

	}

}
