

public class TestPhoneBook {

	public static void main(String[] args) {
		PhoneBook pb=new PhoneBook();
		
		int n=pb.numeroEntradas();
		System.out.println(n);
		
		pb.enterNumber("Juan", "654987321");
		pb.enterNumber("Juana", "888987321");
		pb.enterNumber("Pepe", "698747321");
		n=pb.numeroEntradas();
		System.out.println(n);
		
		String tel=pb.lookupNumber("Pepe");
		System.out.println(tel);
		
		//Ejercicio 3. Ha reescrito el teléfono
		pb.enterNumber("Pepe", "123456789");
		tel=pb.lookupNumber("Pepe");
		System.out.println(tel);
		
		//Ejercicio 4
		boolean b=pb.contieneClave("Pepe");
		System.out.println(b);
		
		b=pb.contieneClave("Maria");
		System.out.println(b);
		
		//Ejercicio 5
		tel=pb.lookupNumber("Maria");
		System.out.println(tel);
		
		//Ejercicio 6
		pb.mostrarMap();
	}
}
