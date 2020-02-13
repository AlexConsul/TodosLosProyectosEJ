import java.util.StringTokenizer;

public class Ej2 {
	public static void main(String[] args) {
		String chain="elephantjjjmouse";
		System.out.println(chain);
		chain="elephantjjjmousejjjelephant";
		System.out.println(chain);
		}
	public boolean mouseElephant(String chain) {
		StringTokenizer st = new StringTokenizer(chain, "jjj");
			String mouse,elephant;
			int contmouse=0;
			int contelephant=0;
			while(st.hasMoreElements()) {
				String el=st.nextToken(); 
				if(el.equals("mouse")) {
					contmouse++;
				}else if(el.equals("elephant")) {
					contelephant++;
				}
			}
			if(contmouse==contelephant) {
				return true;
			} else {
				return false;
			}
	}
}
