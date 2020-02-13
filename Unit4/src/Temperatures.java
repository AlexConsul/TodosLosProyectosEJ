
public class Temperatures {

	
	private int[][] temp;
	
	public Temperatures(){
		temp=new int[5][5];
	}
	
	public void assignTemperatures() {		
		
		for (int x = 0; x < temp.length; x++) {
			for (int y = 0; y < temp[x].length; y++) {
				//Asigno mi número aleatorio
				temp[x][y]=(int) (Math.random() * 50) + 1;
			}
		}	
		
	}
	
	public double calculateAverage() {
		int suma=0;
		for (int x = 0; x < temp.length; x++) {
			for (int y = 0; y < temp[x].length; y++) {
				 
				suma=suma+temp[x][y];
			}
		}	
		int elementos=temp.length*temp[0].length;
		double media=suma/elementos;
		return media;
	}
	
	public  void printTemperatures() {
		for (int x = 0; x < temp.length; x++) {
			for (int y = 0; y < temp[x].length; y++) {
				System.out.print(" | " + temp[x][y] + " | ");
			}
			System.out.println("\n");

		}

	}
	
	public static void main(String[] args) {
		
		Temperatures t=new Temperatures();
		t.assignTemperatures();
		
		t.printTemperatures();
		System.out.println("La media es:" + t.calculateAverage());
	}
	
	
}
