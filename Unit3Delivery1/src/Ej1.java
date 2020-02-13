
public class Ej1 {
	public static void main(String[] args) {
		String chain="Hello";
		String token="@";
		int times=4;
		Ej1 ej1=new Ej1();
		System.out.println(ej1.addToken(chain, token, times));
		times=1;
		System.out.println(ej1.addToken(chain, token, times));
		times=0;
		System.out.println(ej1.addToken(chain, token, times));
	}
	
	public String addToken(String chain, String token, int times) {
		String texto="";
		int count=1;
		while(count<=times) {
			count++;
			texto=texto+chain+token;
		}
		return texto;
	} 
}
