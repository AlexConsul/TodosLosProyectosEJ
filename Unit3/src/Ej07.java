import java.util.Scanner;

public class Ej07 {

	private static Scanner reader;

	public static void main(String[] args) {
		Ej07 ej07=new Ej07();
		//int numInvertido=ej7.invertirNumero(9876543);
		//System.out.println(numInvertido);
		
		System.out.println("Introce un número");
		reader = new Scanner(System.in);
		int num=reader.nextInt();
		boolean omirp=ej07.esOmirp(num);
		
		if(omirp) {
			System.out.println("Omirp");
		}else {
			System.out.println("No omirp");
		}
	}
	
	public boolean esOmirp(int num) {
		int inv=invertirNumero(num);
		if(esPrimo(num)&&esPrimo(inv)) {
			return true;
		}else {
			return false;
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
	
	public int invertirNumeroConString(int numero) {
		//Paso el número 1389 a String "1389"
		String num=String.valueOf(numero);
		//Uso las clases String para revertirlo "1389" -> "9831"
		String inv= new StringBuilder(num).reverse().toString();
		//Paso mi String "9831" al entero 9831
		int numinv=Integer.parseInt(inv);   
		return numinv;
				
	}
	
	public  int invertirNumero(int numero){
        int cifra, inverso = 0;
        /*int digitos=Integer.toString(numero).length();
        for(int i=1;i<=digitos;i++){
            cifra = numero%10;
            inverso = (inverso * 10) + cifra;
            numero=numero/10;
        }
        */
        while(numero>0) {
        	cifra = numero%10;
            inverso = (inverso * 10) + cifra;
            numero=numero/10;
        }
        return inverso;
    }
}
