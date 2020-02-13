
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PruebaArrayList {

	public static void main(String[] args) {
		 List<String> lst=new ArrayList<String>();
		 
		 lst.add("alpha");
		 lst.add("beta");
		 lst.add("charlie");
		 System.out.println(lst);
		 
		 for(String str: lst) {
			 System.out.println(str);
		 }
		 
		 Iterator<String> iter=lst.iterator();
		 while (iter.hasNext()) {
			 String str=iter.next();
			 System.out.println(str);
		 }

	}

}