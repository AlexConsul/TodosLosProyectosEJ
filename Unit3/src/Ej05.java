import java.util.Scanner;

public class Ej05 {
	private static Scanner reader;

	public static void main(String[] args) {
		System.out.println("Introce un número");
		reader = new Scanner(System.in);
		int num=reader.nextInt();
		
		Ej05 ej05=new Ej05();
		boolean primo=ej05.esPrimo(num);
		
		if (primo) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
	}
	
	public boolean esPrimo(int num) {
		boolean primo=true;
		//Miro con un bucle si hay algun número desde 2 hasta n/2 cuyo resto sea 0. Si lo encuentro primo=false
		for(int i=2;i<=(num/2);i++) {
			
			if(num%i==0) {
				primo=false;
				
			}
		}
		
		return primo;
	}
}
