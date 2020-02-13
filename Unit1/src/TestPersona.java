
public class TestPersona {

	public static void main(String[] args) {
		Persona p1=new Persona();
		System.out.println(p1.isAdult());
		System.out.println(p1.toString());
		p1.setName("María");
		p1.setDni("16878878J");
		p1.setAge(19);
		p1.setGender('W');
		p1.setHeight(1.70);
		p1.setWeight(65);	
		System.out.println(p1.isAdult());
		System.out.println(p1.toString());
		System.out.println("Peso ideal "+p1.idealWeight());
		
		
		Persona p2=new Persona("Pepe",15,'M');
		System.out.println(p2.isAdult());
		System.out.println(p2.toString());
		p2.setDni("16123878J");
		p2.setHeight(1.80);
		p2.setWeight(77);
		System.out.println(p2.isAdult());
		System.out.println(p2.toString());
		System.out.println("Peso ideal "+p2.idealWeight());
		
		Persona p3=new Persona("Juan",26,"16123456Y", 'M', 80, 1.86);
		System.out.println(p3.isAdult());
		System.out.println(p3.toString());
		p3.setHeight(1.60);
		System.out.println(p3.isAdult());
		System.out.println(p3.toString());
		System.out.println("Peso ideal "+p3.idealWeight());
	}
}