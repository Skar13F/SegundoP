/*Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 05 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Solicita 2 números al usuario, con base en ellos calcula la suma, resta,
 * 				multiplicación y división entre ambos
 */
package ejercicio4;

public class Operaciones {
	private double valor1;
	private double valor2;

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public void Calculo() {
		System.out.println("\n\n-----------------------------------------------------------");
		double resul = valor1 + valor2;
		System.out.println("La suma de los numeros " + valor1 + " y " + valor2 + " es: " + resul);
		System.out.println("-----------------------------------------------------------");
		resul = valor1 - valor2;
		System.out.println("La resta de los numeros " + valor1 + " y " + valor2 + " es: " + resul);
		System.out.println("-----------------------------------------------------------");
		resul = valor1 * valor2;
		System.out.println("La multiplicación de los numeros " + valor1 + " y " + valor2 + " es: " + resul);
		System.out.println("-----------------------------------------------------------");
		resul = valor1 / valor2;
		System.out.println("La división de los numeros " + valor1 + " y " + valor2 + " es: " + resul);
	}
}
