import java.util.Scanner;

public class Ej06 {
	private static Scanner reader;

	public static void main(String[] args) {
		System.out.println("Introce un número");
		reader = new Scanner(System.in);
		int num = reader.nextInt();

		Ej05 ej05 = new Ej05();
		int i = 2;
		while (i < num) {
			boolean primo = ej05.esPrimo(num);
			if (primo) {
				System.out.println(i);
			}
			i++;
		}
	}
}
