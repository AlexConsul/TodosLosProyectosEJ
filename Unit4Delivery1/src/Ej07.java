import java.util.HashSet;

public class Ej07 {
	public static void main(String[] args) {
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		System.out.println("Conjunto 1:");
		for(Integer item:set1) {
			System.out.print(item.toString()+" ");
		}
		System.out.println(" ");
		HashSet<Integer> set2=new HashSet<Integer>();
		set2.add(3);
		set2.add(5);
		set2.add(7);
		
		System.out.println("Conjunto 2:");
		for(Integer item:set2) {
			System.out.print(item.toString()+" ");
		}
		System.out.println(" ");
		System.out.println("Conjunto 3:");
		HashSet<Integer> set3=unionConjuntos(set1,set2);
		System.out.println(set3.toString());
	}
	
	
	public static HashSet<Integer> unionConjuntos(HashSet<Integer> set1,HashSet<Integer> set2) {
		HashSet<Integer> set3=new HashSet<Integer>();
		for (Integer item:set1) {
			set3.add(item);
		}
		for (Integer item:set2) {
			set3.add(item);
		}
		return set3;
	}
	
}