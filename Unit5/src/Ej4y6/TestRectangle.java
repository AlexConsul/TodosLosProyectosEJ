package Ej4y6;

public class TestRectangle {

	public static void main(String[] args) {
		RectangleS c1=new RectangleS();
		System.out.println("El rectángulo tiene una anchura de "+c1.getWidth()+", una longitud de "+c1.getLength()+" , es de area "+c1.getArea() + " y tiene de perímetro "+c1.getPerimeter());
		
		RectangleS c2=new RectangleS();
		c2.setWidth(5.0);
		c2.setLength(20.0);
		System.out.println("El rectángulo tiene una anchura de "+c2.getWidth()+", una longitud de "+c2.getLength()+" y es de area "+c2.getArea() + " y tiene de perímetro "+c2.getPerimeter());
	
		RectangleS c3=new RectangleS(2.0,3.0);
		System.out.println("El rectángulo tiene una anchura de "+c3.getWidth()+", una longitud de "+c3.getLength()+" y es de area "+c3.getArea() + " y tiene de perímetro "+c3.getPerimeter());
		
		RectangleS c4=new RectangleS(3.0,5.0);
		System.out.println(c4.toString());
	}

	}


