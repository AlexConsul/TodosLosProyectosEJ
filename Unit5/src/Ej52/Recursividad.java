package Ej52;

public class Recursividad {
	private void Recursividad(int num) {
		if(num<=1) {
			
		} else {
			num--;
			Recursividad(num);
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		Recursividad r=new Recursividad();
		int num=5;
		r.Recursividad(num+1);
	}
}
