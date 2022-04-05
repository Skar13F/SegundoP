package ejercicio8;

import java.util.Scanner;

public class Principal {
	static Scanner s;
	static Salario sal;;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		sal= new Salario();
		System.out.print("Ingresa el total de horas trabajadas: ");
		sal.setTotal(s.nextFloat());
		sal.Resultado();

	}

}
