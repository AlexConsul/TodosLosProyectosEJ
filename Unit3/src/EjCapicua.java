import java.util.Scanner;

public class EjCapicua {

	private static Scanner reader;

	public static void main(String[] args) {
		System.out.println("Introce un número");
		reader = new Scanner(System.in);
		int num=reader.nextInt();
		EjCapicua c=new EjCapicua();
		boolean Capicua=c.esCapicua(num);
		
		if(Capicua) {
			System.out.println("Es capicua");
		}else {
			System.out.println("No es capicua");
		}
	}
	
	
	public boolean esCapicua(int numero) {
		if(numero==invertirNumeroConString(numero)) {
			return true;
			
		}
		else {
			return false;
		}
	}
	
	public int invertirNumeroConString(int numero) {
			String num=String.valueOf(numero);
			String inv= new StringBuilder(num).reverse().toString();
			int numinv=Integer.parseInt(inv);   
			return numinv;
					
		
		
		
		
	}	
}
