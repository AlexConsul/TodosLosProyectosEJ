
public class Circle {
	private double radius;
	private String color;
	
	//Constructores
	public Circle() {
		this.radius=1.0;
		this.color="rojo";
	}
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public Circle(double radius,String color) {
		this.radius=radius;
		this.color=color;
	}
	
	//Getters
	public double setRadius(double radius) {
		return radius;
	}
	
	public String setColor(String color) {
		return color;
	}

	public String getColor() {
		return color;
	}

	//Métodos
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	
	
	public String toString() {
		return "Radio: "+this.radius+", Color:"+this.color;
	}
}
