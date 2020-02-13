
public class EjString {
	public static void main(String[] args) {
		String s="hola";
		String s2="12345";
		String s3=s+s2;
		System.out.println(s3);
		String s4="Hola";
		String s5="12345";
		s3.toUpperCase();
		//Longitud
		System.out.println("Longitud");
		System.out.println(s.length());
		System.out.println(s.isEmpty());
		
		//Comparación
		System.out.println("Comparación");
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s4));
		System.out.println(s.equalsIgnoreCase(s4));
		System.out.println(s.compareTo(s5));
		System.out.println(s.compareToIgnoreCase(s5));
		System.out.println(s.startsWith("ho"));
		System.out.println(s.startsWith("ol",1));
		System.out.println(s.endsWith("la"));
		
		//Busqueda e Indexación
		System.out.println("Busqueda e Indexación");
		System.out.println(s.indexOf("la"));
		System.out.println(s3.indexOf("a",4));
		System.out.println(s.indexOf('a'));
		System.out.println(s3.indexOf('a',4));
		System.out.println(s3.lastIndexOf("a"));
		System.out.println(s3.lastIndexOf("a",4));
		
		//Extraer una parte de la cadena
		System.out.println("Extraer una parte de la cadena");
		System.out.println(s.charAt(2));
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,3));
		
		//Crear un nuevo string o char[]
		System.out.println("Crear un nuevo string o char[]");
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		String s6="  hola  ";
		System.out.println(s.trim());
		System.out.println(s3.replace('a', 'j'));
		System.out.println(s.concat(s2));
		
		//Otros métodos
		System.out.println(s.valueOf(2));
		
		
	}
}
