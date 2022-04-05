/*Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 05 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: crea un clase Rectángulo extendido de la clase figura
 */
package ejercicio5Areas;

public class Rectangulo extends Figura{
	@Override
	public float Area() {
		return getBase()*getAltura();
	}

}
