package Ej52;

import java.util.Scanner;

public class Wrappers {
	private char n;
	
	Wrappers(char num) {
		this.n=num;
	}
	
	public String Character(char num) { 
		Character ch = new Character(num);
		boolean isANumber=false;
		if(ch.isDigit(num)) {
			isANumber=true;
			return "�Es un n�mero? "+isANumber;
		} else { 
			return "�Es un n�mero? "+isANumber;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Escriba un n�mero o caracter:");
		Scanner teclado=new Scanner(System.in);
		char num= teclado.next().charAt(0);
		Wrappers w=new Wrappers(num);
		System.out.println(w.Character(num));
	}
}
