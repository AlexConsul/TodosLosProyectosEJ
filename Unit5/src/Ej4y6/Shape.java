package Ej4y6;

public class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {
		this.color="red";
		this.filled=true;
	}
	
	public Shape(String color,boolean filled) {
		this.color=color;
		this.filled=filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public double getArea() {
		return 0;
	}
	
	public double getPerimeter() {
		return 0;
	}
	
	public String toString() {
		return "A Shape with color of "+color+" and filled "+filled;
	}
}
