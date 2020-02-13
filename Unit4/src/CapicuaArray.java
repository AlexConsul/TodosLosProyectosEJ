
import java.util.Scanner;

public class CapicuaArray {
	private static Scanner reader;

	public static void main(String[] args) {
		System.out.println("Introce un número");
		reader = new Scanner(System.in);
		int num=reader.nextInt();
		//Creo la instancia de mi clase, de Capicua
		CapicuaArray c=new CapicuaArray();
		//Llamo al método
		boolean capicua=c.esCapicua(num);
		//Devuelvo el resultado
		if(capicua) {
			System.out.println("Es capicua");
		}else {
			System.out.println("No es capicua");
		}
	}

	public boolean esCapicua(int numero) {
		if (numero == invertirNumeroConArray(numero)) {
			return true;
		} else {
			return false;
		}
	}

	public static int invertirNumeroConString(int numero) {
		// Paso el número 1389 a String "1389"
		String num = String.valueOf(numero);
		// Uso las clases String para revertirlo "1389" -> "9831"
		String inv = new StringBuilder(num).reverse().toString();
		// Paso mi String "9831" al entero 9831
		int numinv = Integer.parseInt(inv);
		return numinv;

	}
	
	public static int invertirNumeroConArray(int numero) {
		// Paso el número 1389 a String "1389"
		String num = String.valueOf(numero);
		//Convierto mi String en un array de caracteres {'1', '3', '8',' '9'} 
		char[] aCaracteres = num.toCharArray();
		
		//Recorro mi array del final al principio para invertirlo "9831"
		String inv = "";
		for(int i=aCaracteres.length-1; i>=0;i--) {
			inv=inv+aCaracteres[i];
		}
		
		// Paso mi String "9831" al entero 9831
		int numinv = Integer.parseInt(inv);
		return numinv;

	}
}
