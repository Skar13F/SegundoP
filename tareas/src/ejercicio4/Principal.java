/*Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 05 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Solicita 2 números al usuario, con base en ellos calcula la suma, resta,
 * 				multiplicación y división entre ambos
 */
package ejercicio4;

import java.util.Scanner;

public class Principal {
	static Operaciones op = new Operaciones();
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Ingresa el primer numero: ");
		op.setValor1(s.nextDouble());
		System.out.print("Ingresa el segundo numero: ");
		op.setValor2(s.nextDouble());
		op.Calculo();

	}

}
