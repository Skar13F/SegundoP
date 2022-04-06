/*Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 04 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Convertir mb a kb
 */
package ejercicio10;

public class MbaKb {
	private double mb;
	private double kb=1000;
	public double getMb() {
		return mb;
	}

	public void setMb(double mb) {
		this.mb = mb;
	}

	public double getKb() {
		return kb;
	}

	public void setKb(double kb) {
		this.kb = kb;
	}

	public double Resul() {
		return this.mb*this.kb;
	}

}