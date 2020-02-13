import java.util.Scanner;

public class Ej04 {
	private static Scanner reader;

	public static void main(String[] args) {
		System.out.println("Introce un número");
		reader = new Scanner(System.in);
		int num=reader.nextInt();
		
		//LLamada al método
		Ej04 ej4 = new Ej04();
		boolean par = ej4.esPar(num);
		
		//Evaluo el resultado
		if (par) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		
	}
	
	public boolean esPar(int num) {
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
	}
}
