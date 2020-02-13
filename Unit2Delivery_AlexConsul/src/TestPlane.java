
public class TestPlane {

	public static void main(String[]args) {
		Plane p1=new Plane(2,-3);
		p1.cuadrante();
		System.out.println("El punto"+p1.getX()+","+p1.getY()+") esta en el primer cuadrante");
		
		Plane p2=new Plane(8,-4);
		p2.cuadrante();
		System.out.println("El punto"+p2.getX()+","+p2.getY()+") esta en el segundo cuadrante");
		
		Plane p3=new Plane(2,-6);
		p3.cuadrante();
		System.out.println("El punto"+p3.getX()+","+p3.getY()+") esta en el tercer cuadrante");
		
		Plane p4=new Plane(5,-2);
		p4.cuadrante();
		System.out.println("El punto"+p4.getX()+","+p4.getY()+") esta en el cuarto cuadrante");
	}
	
	
	
	
}
