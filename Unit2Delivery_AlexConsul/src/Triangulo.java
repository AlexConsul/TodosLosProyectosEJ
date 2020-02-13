
public class Triangulo {
	
	// 1. Estado
	private double lado1;
	private double lado2;
	private double lado3;

	// 2. Comportamiento

	// 2.1.Constructores

	public Triangulo(double l1, double l2, double l3) {
		lado1 = l1;
		lado2 = l2;
		lado3 = l3;
	}

	public Triangulo() {
		lado1 = 5;
		lado2 = 6.5;
		lado3 = 9.9;
	}
	//2.2. Métodos

	public boolean esEquilatero() {
		if ((lado1 == lado2) && (lado2 == lado3)) {
			return true;
		} else {
			return false;
		}
	}

	public double perimetro() {
		return lado1+lado2+lado3;
		
	}
	// 3 Pruebas del programa
	public static void main(String[] args) {
		Triangulo t1=new Triangulo();
		System.out.println("¿Es equilatero? "+t1.esEquilatero()+". El perímetro es "+t1.perimetro());

		Triangulo t2=new Triangulo(6,6,6);
		System.out.println("¿Es equilatero? "+t2.esEquilatero()+". El perímetro es "+t2.perimetro());
	}

}

