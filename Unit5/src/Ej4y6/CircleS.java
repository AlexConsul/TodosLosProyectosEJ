package Ej4y6;

public class CircleS {
	private double radius;
	
	public CircleS() {
		this.radius=1.0;
	}
	
	public CircleS(double radius) {
		this.radius=radius;
	}
	
	public CircleS(double radius,String color,boolean filled) {
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	
	public double getPerimeter() {
		return 2*this.radius*Math.PI;
	}
	
	public String toString() {
		return "A Circle with radius="+radius+" which is a subclass of ";
	}
}
