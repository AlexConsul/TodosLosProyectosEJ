import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej18 {

	private static Scanner reader1;

	public static void main(String[] args) {
		System.out.print("Introduce un Nombre y apellidos: ");
		reader1 = new Scanner(System.in);

		String nombre = reader1.nextLine();
		StringTokenizer st=new StringTokenizer(nombre);
		
		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken().charAt(0));
			
		}
		
	}

}