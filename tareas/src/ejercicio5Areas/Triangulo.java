/*Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 05 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: crea un clase Triángulo extendido de la clase figura
 */
package ejercicio5Areas;

public class Triangulo extends Figura{
	@Override
	public float Area() {
		return (getBase()*getAltura())/2;
	}

}
