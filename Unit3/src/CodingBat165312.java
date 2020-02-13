
public class CodingBat165312 {

	public static void main(String[] args) {
		CodingBat165312 cb=new CodingBat165312();
		System.out.println(cb.doubleChar("Hola"));
		

	}
	
	public String doubleChar(String str) {
		String str2="";  
		for (int i=0; i<str.length();i++) {
			  char c=str.charAt(i);
			  str2=str2+c+c;
			  
		  }
		
		return str2;
		}


}
