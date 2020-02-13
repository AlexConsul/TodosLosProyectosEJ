import java.util.Scanner;

public class EJWrite18 {

	public static void main(String[] args) {
		System.out.print("Introduce un Nombre: ");
		Scanner reader1 = new Scanner(System.in);

		String Nombre = reader1.nextLine();
		System.out.print("Introduce un Apellido: ");
		String Apellido = reader1.nextLine();
		System.out.println("Las iniciales son: " + Nombre.charAt(0) + "." + Apellido.charAt(0));

	}

}
