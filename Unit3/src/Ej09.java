import java.util.Scanner;

public class Ej09 {
	private static Scanner reader;

	public static void main(String[] args) {
		Ej09 ej09=new Ej09();
		
		
		System.out.println("Introce un número");
		reader = new Scanner(System.in);
		int num=reader.nextInt();
		int factorial=ej09.factorial(num);
		System.out.println("El factorial de "+num+" es "+factorial);
		
	}
	
	public int factorial(int n) {
		int factorial=1;
		for (int i=2; i<=n; i++) {
			factorial=factorial*i;
		}
		
		return factorial;
	}
}
