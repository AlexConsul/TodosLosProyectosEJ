
public class Bisiesto {

	public static boolean comprobarBisiesto(int numero) {
		if(numero>(numero/4)) {
			return true;
		}else {
			return false;
		}	
	}
	
	public static void imprimirBisiestos(int num1, int num2) {
		System.out.println(comprobarBisiesto(2000));
		System.out.println(comprobarBisiesto(2019));
				
	}

	public static void main(String[] args) {
		Bisiesto b=new Bisiesto();
		int numero = 2000;
		System.out.println(Bisiesto.comprobarBisiesto(numero));
	
	}
}