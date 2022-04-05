/*Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 05 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: calcula el total de una factura
 */
package ejercicio7;

import java.util.Scanner;

public class Principal {
	static Scanner s;
	static Factura fact;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		fact = new Factura();
		System.out.print("Ingresa el subtotal de la factura: ");
		fact.setSubtotal(s.nextFloat());
		System.out.println("Subtotal:	" + fact.getSubtotal() + "\nIVA:		16.0%" + "\nDescuento:	0.0"
				+ "\nTotal:		" + fact.Total());

	}

}
