import java.util.ArrayList;
import java.util.List;

public class Ej11 {
	public static void main(String[] args) {
		 List<Integer> list1=new ArrayList<Integer>();
		 list1.add(10);
		 list1.add(20);
		 list1.add(30);
		 System.out.println("Antes de pasar por el método mystery5:"+list1);
		 System.out.println("Después de pasar por el método mystery5:");
		 System.out.println(" ");
		 
		 List<Integer> list2=new ArrayList<Integer>();
		 list2.add(8);
		 list2.add(2);
		 list2.add(9);
		 list2.add(7);
		 list2.add(4);
		 System.out.println("Antes de pasar por el método mystery5:"+list2);
		 System.out.println("Después de pasar por el método mystery5:");
		 System.out.println(" ");
		 
		 List<Integer> list3=new ArrayList<Integer>();
		 list3.add(-1);
		 list3.add(3);
		 list3.add(28);
		 list3.add(17);
		 list3.add(9);
		 list3.add(33);
		 System.out.println("Antes de pasar por el método mystery5:"+list3);
		 System.out.println("Después de pasar por el método mystery5:");
		 System.out.println(" ");
	}

	public static void mystery5(ArrayList<Integer> list) {
		for (int i=0;i<list.size();i++) {
			int element=list.get(i);
			list.remove(i);
			list.add(0, element +1);
		}
		System.out.println(list);
	}
}
