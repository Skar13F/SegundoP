/*Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 04 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Solicita 2 numeros al usuario, los multiplica e imprime el resultado
 * 
 */
package ejercicio1;

public class Multiplicacion {
	private double num1;
	private double num2;

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double Resultado() {
		double resul = num1 * num2;
		//System.out.println("resultado: "+ resul);
		//podemos imprimir el resultado aquí y no devover nada que sea de tipo void el método
		return resul;
	}

}
