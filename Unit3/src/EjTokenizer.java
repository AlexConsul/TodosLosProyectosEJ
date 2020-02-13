import java.util.StringTokenizer;

public class EjTokenizer {
	public static void main(String[] arguments) {
		String cadena="Juan\n5.5\nAmelia\n8.6\nAlejandro\n2.0";
		StringTokenizer st = new StringTokenizer(cadena, "\n");

		   while(st.hasMoreTokens()) {
			   String nombre = st.nextToken();
			   String nota = st.nextToken();
			   System.out.println("El/La alumno/a "+nombre+" ha sacado un "+nota);
		   }
	}
}