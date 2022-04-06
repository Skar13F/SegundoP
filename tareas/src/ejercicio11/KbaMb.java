/*Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 04 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Convertir kb a mb
 */
package ejercicio11;

public class KbaMb {
	private double mb=0.001;
	private double kb;
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