import java.util.Scanner;

public class Ej14 {
	static Scanner reader=new Scanner(System.in);
	public static void main(String[] arguments) {
		System.out.println("Introduce un número");
		int num=reader.nextInt();
		int i=num;
		int resto, suma=0;
		while(num>0) {
			resto=num%10;
			num=num/10;
			suma=suma+resto*resto*resto;
		}
	
		if (i==suma) {
			System.out.println("Es Armstrong");
		} else {
			System.out.println("No es Armstrong");
		}
	}
}
