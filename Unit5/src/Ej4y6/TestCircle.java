package Ej4y6;

public class TestCircle {
	public static void main(String[] args) {
		Circle c1=new Circle();
		System.out.println("El círculo tiene un radio de "+c1.getRadius()+", una área de "+c1.getArea()+" y es de color "+c1.getColor());
		
		Circle c2=new Circle(2.0);
		c2.setColor("rosa");
		c2.setRadius(3.0);
		System.out.println("El círculo tiene un radio de "+c2.getRadius()+", una área de "+c2.getArea()+" y es de color "+c2.getColor());
	
		Circle c3=new Circle(2.0,"azul");
		System.out.println("El círculo tiene un radio de "+c3.getRadius()+", una área de "+c3.getArea()+" y es de color "+c3.getColor());
		
		Circle c4=new Circle(3.0,"azul");
		c4.getColor();
		System.out.println(c4.toString());
	}
}
