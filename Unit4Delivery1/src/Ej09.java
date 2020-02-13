import java.util.ArrayList;
import java.util.List;

public class Ej09 {
	public static void main(String[] args) {
		List<Integer> al1=new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		
		List<Integer> al2=new ArrayList<Integer>();
		al1.add(3);
		al1.add(5);
		al1.add(7);
		
		List<Integer> al3=unionArrayList(al1,al2);
		System.out.println(al3.toString());
	}
	
	public static List<Integer> unionArrayList(List<Integer> al1, List<Integer> al2){
		List<Integer> al3=new ArrayList<Integer>();
		 for(Integer i: al1) {
			 al3.add(i);
		 }
		 for(Integer i: al2) {
			 al3.add(i);
		 }
		return al3;
	}
}
