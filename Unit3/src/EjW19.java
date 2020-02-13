import java.util.Scanner;

public class EjW19 {
	private static Scanner texto;
	private static Scanner reader;

	public static void main(String[] arguments) {
		System.out.println("Introduzca una palabra:");
	    reader = new Scanner (System.in);
	    String cadena=reader.nextLine();
	    
	    System.out.println("Introduzca un carácter:");
	    texto = new Scanner (System.in); 
	    char letra=texto.nextLine().charAt(0);
	    
	    EjW19 ej19=new EjW19();
	    int num=ej19.countCharacter(letra, cadena);
	    
	    System.out.println("La letra "+ letra+ " aparece en "+cadena+" "+num+ " veces");
	}
	
	public int countCharacter(char letra, String cadena) {
		int cont = 0;
			for(int i= 0;i<cadena.length();i++ ) {
				char c=cadena.charAt(i);
				if (c==letra ) {
					cont++;
				}
				
			}
				
			
		return cont;
		
	}
		
		
		
	
}	

