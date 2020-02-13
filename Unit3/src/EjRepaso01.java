
public class EjRepaso01 {
	//Estado
	private int x,y;
	private static EjRepaso01 m1;
	
	//Comportamiento
	
	//Constructores
	public EjRepaso01(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public EjRepaso01() {
		x=0;
		y=0;
	}
	
	//Getters and Setters
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//Métodos
	public int setxy(int x, int y) {
		x=0;
		y=0;
		return y;
	}
	public String toString() {
		return null;
	}
	public void calculaDistancia(int x1, int y1) {
		return;
	}
	//Programa de prueba
	public static void main(String[] arguments) {
		m1 = new EjRepaso01();
		System.out.println();
	}
	
}
