
public class Ej10_ParImpar {

	public static void main(String[] arguments) {
	int n=5000;
	int numero = (int) (Math.random() * n) + 1; 
	
	System.out.println(numero);
	boolean esPar=(numero%2==0);
	System.out.println("¿"+ numero+ " es par "+esPar+" ? ");
	
	if(numero%2==0) {
		System.out.println(numero+ " es par ");
	}else {
		System.out.println(numero+ " es impar ");
	}
	
	}
}
