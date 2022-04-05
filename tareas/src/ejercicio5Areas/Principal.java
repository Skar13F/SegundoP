package ejercicio5Areas;
import java.util.Scanner;

public class Principal {
	static Rectangulo rec = new Rectangulo();
	static Triangulo tri=new Triangulo();
	static Scanner s= new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("ingresa el tamaño de la base del rectángulo: ");
		rec.setBase(s.nextFloat());
		System.out.println("ingresa el tamaño de la altura del rectángulo: ");
		rec.setAltura(s.nextFloat());
		System.out.println("\ningresa el tamaño de la base para el triángulo: ");
		tri.setBase(s.nextFloat());
		System.out.println("ingresa el tamaño de la altura para el triángulo: ");
		tri.setAltura(s.nextFloat());
		
		System.out.println("\nEl área del rectángulo es: "+rec.Area());
		System.out.println("El área del triángulo es: "+tri.Area());
	}

}
