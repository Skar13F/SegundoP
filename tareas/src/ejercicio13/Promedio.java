/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 06 de abril de 2022
 * Fecha de actualización: 06 de abril
 * Descripción: calcula el promedio trimestral de un alumno en base a la calificación de su primer examen
 * 				y la nota que desea obtener al finali
 */
package ejercicio13;

public class Promedio {
	private float exam1;
	private float trimestre;

	public float getExam1() {
		return exam1;
	}

	public void setExam1(float exam1) {
		this.exam1 = exam1;
	}

	public float getTrimestre() {
		return trimestre;
	}
	public void setTrimestre(float trimestre) {
		this.trimestre = trimestre;
	}

	public float Examen2() {
		return (getTrimestre() - (getExam1() * 0.4f)) / 0.6f;
	}
}
