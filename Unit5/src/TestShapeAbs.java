
public class TestShapeAbs {
	public static void main(String[] args) {
		ShapeAbs s1=new CircleSAbs(5.5, "RED", false);
		System.out.println(s1); //toString de CircleSAbs
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
		System.out.println(s1.getColor()); //valor de ShapeAbs
		System.out.println(s1.isFilled()); //valor de ShapeAbs
		//System.out.println(s1.getRadius()); da error
		System.out.println("");
		
		CircleSAbs c1=(CircleSAbs)s1;
		System.out.println(c1); //toString de CircleSAbs
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor()); //valor de ShapeAbs
		System.out.println(c1.isFilled()); //valor de ShapeAbs
		System.out.println(c1.getRadius()); //el radio puesto arriba
		System.out.println("");
		
		//ShapeAbs s2=new ShapeAbs(); da error
		
		ShapeAbs s3=new RectangleSAbs(1.0, 2.0, "RED", false);
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor()); //valor de ShapeAbs
		//System.out.println(s3.getLength()); da error
	}
}
