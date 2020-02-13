

public class Child extends Parent{
	String name;
	public void details() {
		super.details();
		name="Child";
		System.out.println(name);
		
	}
	public static void main (String[] args) {
		Child cobj=new Child();
		cobj.details();
	}
}
