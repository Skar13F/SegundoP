package ejercicio8;

public class Salario {
	private float salXhora=25.45f;
	private float total;

	public void Resultado() {
		System.out.println("El total de tu salario para esta semana es de: " + total * salXhora);
	}

	public float getSalXhora() {
		return salXhora;
	}

	public void setSalXhora(float salXhora) {
		this.salXhora = salXhora;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
}
