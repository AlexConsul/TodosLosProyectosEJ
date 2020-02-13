

import java.util.HashMap;

public class PruebaHashMap {
	public static void main(String[] args) {
	HashMap<String, String> phoneBook=new HashMap<String, String>();
	
	phoneBook.put("Charles", "645321472");
	phoneBook.put("Juan", "654897065");
	phoneBook.put("Pedro", "690654321");
	
	System.out.println(phoneBook.get("Charles"));
	}
}	
