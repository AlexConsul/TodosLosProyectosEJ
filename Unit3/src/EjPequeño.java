
public class EjPequeño {

	public static void main(String[] args) {
		 int num1=8,num2=7,num3=6;
		 
		 if((num1<=num2)&&(num1<=num3)) {
			System.out.println(num1+" es el mas pequeño");
		 }
		 
		 else if((num2<=num3)&&(num2<=num1)) {
				System.out.println(num2+" es el mas pequeño");
			 }
		 
		 else {System.out.println(num3+" es el mas pequeño");}
		 
	}

}
