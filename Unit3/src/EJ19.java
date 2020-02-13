
public class EJ19 {

	public static void main(String[] args) {
		EJ19 ej19=new EJ19();
		System.out.println(ej19.countCharacter('l', "hola que tal aaaaa"));

	}
	
	public int countCharacter(char c, String s) {
		int n=0;
		for(int i=0; i<s.length();i++) {
			char caux=s.charAt(i);
			if(c==caux) {
				n++;
			}
		}
		
		
		return n;
	}

}
