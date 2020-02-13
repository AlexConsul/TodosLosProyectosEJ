
public class Primeros5Pares {
	public static void main(String[] args) {
		//Alternativa para usar la función esPar del ej 4
		Ej04 ej04 = new Ej04();
		 
		
		int count=0;
		int limit=5;
		int num=1;
		//Primeros5Pares pp=new Primeros5Pares();
		do {
			if(ej04.esPar(num)) {
				System.out.println(num);
				count++;
			}
			num++;
			
		}while(count<limit);
	}
	
	/*public boolean esPar(int num) {
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
	}*/
}
