
public class EjBreak {
	public static void main(String[] args) {
	
	/*int index = 0;
	while (index <= 1000) 
	{ index = index + 5; 
	if (index == 400) 
		continue; 
	System.out.println("The index is " + index); }
	*/
	int i=0;
	bucleext:
	while (i<100) {
		i++;
		for (int j=0;j<i;j++) {
			System.out.print("*");
			if (i==5) {break bucleext;}
		}
		System.out.println("");
	}
	}
		
}
