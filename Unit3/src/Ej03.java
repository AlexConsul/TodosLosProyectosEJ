
public class Ej03 {

	public static void main(String[] args) {
		 int num1=8,num2=2,num3=10;
		 
		/* int num1=8;
		 int num2=2;
		 int num3=10;*/
		 
		 Ej03 ej03=new Ej03();
		 ej03.suma2en2(num1, num2, num3);
	}
	
	public void suma2en2(int num1, int num2, int num3) {
		if((num1+num2)==num3) {
			System.out.println("La suma de "+num1+" y "+num2+" es "+num3);
		 }
		 
		 else if((num2+num3)==num1) {
			 System.out.println("La suma de "+num2+" y "+num3+" es "+num1);
			 }
		 else if((num1+num3)==num2) {
			 System.out.println("La suma de "+num1+" y "+num3+" es "+num2);}
	}

}
