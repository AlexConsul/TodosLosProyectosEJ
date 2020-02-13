

import java.util.HashSet;

public class PruebaHashSet {
	public static void main(String[] args) {
		HashSet<String> mySet=new HashSet<String>();
		mySet.add("one");
		mySet.add("two");
		mySet.add("three");
		
		for(String item:mySet) {
			System.out.println(item.toString());
		}
		
		mySet.add("three");
		
		for(String item:mySet) {
			System.out.println(item.toString());
		}
		
		int n=mySet.size();
		System.out.println(n);
		
		boolean b=mySet.contains("one");
		System.out.println(b);
		b=mySet.contains("four");
		System.out.println(b);
	}
}
