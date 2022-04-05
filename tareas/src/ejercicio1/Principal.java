/*Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 04 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Solicita 2 numeros al usuario, los multiplica e imprime el resultado
 */
package ejercicio1;

import java.util.Scanner;

import ejercicio1.Multiplicacion;

public class Principal {
	static Multiplicacion mul = new Multiplicacion();
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Ingresa el primer numero: ");
		mul.setNum1(s.nextDouble());
		// mul.setNum1()=s.nextInt();
		System.out.print("Ingresa el segundo numero: ");
		mul.setNum2(s.nextDouble());
		// mul.Resultado(); si imprimimos el resultado desde el metodo solo lo llamamos
		System.out.println("El resultado es: " + mul.Resultado());
	}
}
