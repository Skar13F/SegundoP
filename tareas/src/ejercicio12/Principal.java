/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 06 de abril de 2022
 * Fecha de actualización: 06 de abril
 * Descripción: Calcula el precio de un producto, con iva y aplica un descuento
 */
package ejercicio12;

import java.util.Scanner;

public class Principal {
	static Scanner s;
	static Producto p;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		p = new Producto();
		int iv = -1;
		int desc = -1;
		System.out.print("Digite el precio del producto: ");
		p.setPrecio(s.nextFloat());

		do {
			System.out.print("\nIVA" + "\n1. General" + "\n2. Reducido" + "\n3. Superreducido");
			System.out.print("\nSeleccione la opcion correspondiente al iva: ");
			iv = s.nextInt();
			if (iv == 1) {
				p.setIva(0.21f);
			} else if (iv == 2) {
				p.setIva(0.10f);
			} else if (iv == 3) {
				p.setIva(0.04f);
			}
		} while (iv < 1 || iv > 3);
		do {
			System.out.print("\nDescuentos" + "\n1. sin descuento" + "\n2. Mitad" + "\n3. Menos $5" + "\n4. Menos 5%");
			System.out.print("\nSeleccione la opcion correspondiente al descuento: ");
			desc = s.nextInt();
			if (desc == 1) {
				p.setDescuento(0.0f);
			} else if (desc == 2) {
				p.setDescuento(0.5f);
			} else if (iv == 3) {
				p.setDescuento(5.0f);
			} else if (desc == 4) {
				p.setDescuento(0.05f);
			}
		} while (iv < 1 || iv > 4);
		System.out.println("\n\nPrecio:			" + p.getPrecio() + "\nIVA:			" + p.getIva() * 100 + "%"
				+ "\nPrecio con IVA:		" + p.Iva() + "\nTotal:			" + p.Descuento());
	}

}
