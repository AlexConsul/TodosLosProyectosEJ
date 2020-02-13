import java.util.ArrayList;

public class Ej08 {

	public static void main(String[] args) {
		int [] array= {2,4,-5,6,2,-5};
		int [] arrayAbs= absoluto(array);
		pintarArray(arrayAbs);
		int [] arrayAbs2= absoluto2(array);
		pintarArray(arrayAbs2);
	}
	
	public static int[] absoluto2(int [] array) { 
		int[] arrayAbs=new int[array.length];
		int j=0;
		for(int i=0; i<array.length;i++) {
			if(!containsAbs(arrayAbs,  Math.abs(array[i]))) {
			arrayAbs[j]= Math.abs(array[i]);
			 
			j++;
			}
		}
		return arrayAbs;
	}
	
	//Me dice si array contiene el valor absoluto de n
	public static boolean containsAbs(int [] array, int n) {
		boolean b=false;
		for(int i=0; i<array.length;i++) {
			if(array[i]==n || array[i]==-n) {
				b=true;
			}
		}
		return b;
	}
	
	public static int[] absoluto(int [] array) {
		//Paso my array a un arrayList
		ArrayList<Integer> al=arrayToArrayList(array);
		
		//Trabajo con el arrayList
		ArrayList<Integer> alAbs=new ArrayList<Integer>();
		for(int item: al) {
			if(!alAbs.contains(Math.abs(item))) {
			alAbs.add(Math.abs(item));
			}
		}
		
		//Paso my arrayList a array
		int[] arrayAbs=arrayListToArray(alAbs);
		
		
		//Devuelvo el array
		return arrayAbs;
	}
	
	public static ArrayList<Integer> arrayToArrayList(int [] array){
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int item: array) {
			al.add(item);
		}
		return al;
		
		
	}
	
	public static int []  arrayListToArray( ArrayList<Integer> al){
		int [] array=new int[al.size()];
			for(int i=0; i<al.size();i++) {
				array[i]=al.get(i);
			}
			return array;
	}

	public static void pintarArray(int[] nums) {
		System.out.print("{");
		for(int i=0;i<nums.length-1;i++) {
			System.out.print(nums[i]+", ");
		}
		System.out.print(nums[nums.length-1]);
		System.out.print("}");
	}
}
