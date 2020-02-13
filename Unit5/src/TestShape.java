
public class TestShape {
	public static void main(String[] args) {
		Shape s=new Shape();
		CircleS c=new CircleS();
		RectangleS r=new RectangleS();
		
		System.out.println(c.toString()+s.toString());
		System.out.println("Circle Area="+c.getArea()+" Circle Perimeter="+c.getPerimeter());
		System.out.println(r.toString()+s.toString());
		System.out.println("Rectangle Area="+r.getArea()+" Rectangle Perimeter="+r.getPerimeter());
		System.out.println(" ");
		
		Shape s2=new Shape();
		CircleS c2=new CircleS();
		RectangleS r2=new RectangleS();
		
		c2.setRadius(3.0);
		s2.setColor("blue");
		s2.setFilled(false);
		System.out.println(c2.toString()+s2.toString());
		System.out.println("Circle Area="+c2.getArea()+" Circle Perimeter="+c2.getPerimeter());
		r2.setLength(8.0);
		r2.setWidth(4.0);
		System.out.println(r2.toString()+s2.toString());
		System.out.println("Rectangle Area="+r2.getArea()+" Rectangle Perimeter="+r2.getPerimeter());
	}
}
