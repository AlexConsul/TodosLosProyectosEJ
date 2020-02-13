
import java.util.HashMap;

public class BirthdayDiary {
	private HashMap<String,String> birthdayDiary;
	
	public BirthdayDiary() {
		birthdayDiary=new HashMap<String,String>();
	}	
	public void addBirthday(String name, int day, int month, int year) {
		String date = null;
		birthdayDiary.put(name,date);
	}
	
	public String getBirthdayFor(String name) {
		return birthdayDiary.get(name);
	}
	
	public void printDiary() {
		for(String key:birthdayDiary.keySet()) {
			System.out.println("key="+key+",Value="+birthdayDiary.get(key));
		}
	}
	
	public static void main(String[] args) {
		HashMap<String,String> birthdayDiary=new HashMap<String,String>();
		birthdayDiary.put("Dani","31/12/1996");
		birthdayDiary.put("Tomas","06/11/1998");
		birthdayDiary.put("Ruben","19/08/1997");
		
		System.out.println(birthdayDiary.get("Dani"));
		System.out.println(birthdayDiary.get("Tomas"));
		System.out.println(birthdayDiary.get("Ruben"));
		
	}
}
