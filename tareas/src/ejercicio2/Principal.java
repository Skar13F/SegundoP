/*Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 04 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Solicita 1 numero (cantidad de dolares) al usuario, lo convierte a pesos y lo imprime
 */
package ejercicio2;

import ejercicio2.Conversor;
import java.util.Scanner;

public class Principal {
	static Conversor con = new Conversor();
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Ingresa la cantidad de dolares a convertir: ");
		con.setDollar(s.nextFloat());
		con.Convert();

	}

}
