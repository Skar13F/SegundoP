/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 06 de abril de 2022
 * Fecha de actualización: 06 de abril
 * Descripción: calcula el promedio trimestral de un alumno en base a la calificación de su primer examen
 * 				y la nota que desea obtener al finalizar el trimestre
 */
package ejercicio13;
import java.util.Scanner;
public class Principal {
	static Scanner s;
	static Promedio prom;
	public static void main(String[] args) {
		s=new Scanner(System.in);
		prom=new Promedio();
		
		System.out.println("Ingresa la calificación de tu primer examen: ");
		prom.setExam1(s.nextFloat());
		System.out.println("Qué calificación quieres obtener en el trimestre? ");
		prom.setTrimestre(s.nextFloat());
		System.out.println("\nPara tener un "+prom.getTrimestre()+" en el trimestre necesitas sacar un "+prom.Examen2()+" en el segundo examen");

	}

}
