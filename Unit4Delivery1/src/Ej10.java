import java.util.ArrayList;
import java.util.HashMap;

public class Ej10 {

	public void add(String orden,Integer num) {		
		Ej10.put(orden, num);
		
	}
	
	
	private static void put(String orden, Integer num) {
		//Contar números de un array como [2,4,2,5,5,5,-1]
		ArrayList<Integer> list=new ArrayList<Integer> ();
		list.add(2);
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(-1);
		System.out.println(list.add(num));
	}
			
	public static void mystery5(ArrayList<Integer> list) {
		
		  HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		for (int i=0;i<list.size();i++) {
			int element=list.get(i);
			map.put(0, element +1);
		}
		System.out.println(list);	
	}
	
}
