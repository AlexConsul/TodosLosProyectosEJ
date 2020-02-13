

public class ClubDemo {

	public static void main(String[] args) {
		Membership m1=new Membership("Pepe",11,2016);
		Membership m2=new Membership("María",1,2006);
		Membership m3=new Membership("Juana",2,2003);
		
		Club c=new Club();
		c.join(m1);
		int n=c.numberOfMembers();
		System.out.println(n);
		
		c.join(m2);
		c.join(m3);
		n=c.numberOfMembers();
		System.out.println(n);
		
		c.print();
		
		Membership m4=new Membership("Jaime",3,2018);
		
		c.join(m4);
		n=c.numberOfMembers();
		System.out.println(n);
		
		c.print();
	}

}
