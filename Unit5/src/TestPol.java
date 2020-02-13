

public class TestPol {
	public static void main (String[] args) {
		ParentPol p=new ParentPol();
		Child1Pol c1=new Child1Pol();
		Child2Pol c2=new Child2Pol();
		
		System.out.println(c1 instanceof ParentPol);
		System.out.println(c2 instanceof ParentPol);
		System.out.println(p instanceof Child1Pol);
		System.out.println(p instanceof Child2Pol);
		
		p=c1; //p toma la forma del hijo 1
		System.out.println(p instanceof Child1Pol);
		System.out.println(p instanceof Child2Pol);
		
		p=c2; //p toma la forma del hijo 2
		System.out.println(p instanceof Child1Pol);
		System.out.println(p instanceof Child2Pol);
		
	}
}
