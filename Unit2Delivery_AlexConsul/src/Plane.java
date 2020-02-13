
public class Plane {

	// Estado
	// Atributos

	private double x;
	private double y;

	// Comportamiento
	public Plane(double x, double y) {
		this.x = x;
		this.y = y;

	}

	// Source. Generate Getters and Setters. Getter and Setter

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// Método

	public void cuadrante() {
		if((x>0)&&(y>0)) {
			System.out.println("Primer cuadrante");
		}else if ((x>0)&&(y>0)) {
			
			System.out.println("Segundo cuadrante");
		}else if ((x>0)&&(y>0)) {
				
			System.out.println("Tercer cuadrante");
		}else if ((x>0)&&(y>0)) {
				
			System.out.println("Cuarto cuadrante");
		}else if ((x>0)&&(y>0)) {			
		}
	}
}


