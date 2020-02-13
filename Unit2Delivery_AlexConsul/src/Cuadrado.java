
public class Cuadrado {
	// 1. Estado
	private double lado1;

	// 2. Comportamiento

	// 2.1.Constructores

	public Cuadrado(double l1) {
		lado1 = l1;
	}

	public Cuadrado() {
		lado1 = 8.5;
	}
	
	
	// 2.2. Métodos

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double perimetro() {
		return lado1 * 4;
	}

	public double area() {
		return lado1 * lado1;
	}

	// 3 Pruebas del programa
	public static void main(String[] args) {

		Cuadrado t1 = new Cuadrado();
		System.out.println("El perimetro del cuadrado mide " + t1.perimetro());
		System.out.println("El area del cuadrado mide " + t1.area());

		double lado1 = 10.7;

		Cuadrado t2 = new Cuadrado(lado1);
		System.out.println("El perimetro del cuadrado mide " + t2.perimetro());
		System.out.println("El area del cuadrado mide " + t2.area());
	}
}
