import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Teclado {
	public static char leeCaracter() {
		char ch;
		try {
			ch = leeCadena().charAt(0);
		} catch (Exception e) {
			ch = 0;
		}
		return ch;
	}

	public static String leeCadena() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			str = br.readLine();
		} catch (Exception e) {
			str = "";
		}
		return str;
	}

	public static int leeEntero() {
		int num;
		try {
			num = Integer.parseInt(leeCadena().trim());
		} catch (Exception e) {
			num = 0;
		}
		return num;
	}
}