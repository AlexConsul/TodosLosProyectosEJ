package Ej4y6;

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
	
	//Setters
	public double setRadius(double radius) {
		return radius;
	}
	
	public String setColor(String color) {
		return color;
	}

	//Getters
	public String getColor() {
		return color;
	}

	public double getRadius() {
		return this.radius;
	}
	
	//Métodos
	
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	
	
	public String toString() {
		return "Radio: "+this.radius+", Color:"+this.color;
	}
}
