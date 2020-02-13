

import java.util.HashMap;

public class PhoneBook {
	private HashMap<String,String> phoneBook;
	
	public PhoneBook() {
		phoneBook=new HashMap<String,String>();
	}
	
	public int numeroEntradas() {
		return phoneBook.size();
	}
	
	public void enterNumber(String name, String number) {		
		phoneBook.put(name,number);
	}
	
	public String lookupNumber(String name) {
		return phoneBook.get(name);
	}
	
	public boolean contieneClave(String clave) {
		return phoneBook.containsKey(clave);
	}

	public void mostrarMap() {
		for(String key:phoneBook.keySet()) {
			System.out.println("key="+key+",Value="+phoneBook.get(key));
		}
	}
}
