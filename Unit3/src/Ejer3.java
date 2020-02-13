import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejer3 {

	public static void main(String[] args) {
		 Ejer3 ej3= new Ejer3();
		// Scanner myObj = new Scanner(System.in);
		 //String userName = myObj.nextLine();
		 
		 
		 System.out.println(ej3.comprobarComando("mv manual_linux_v1 manuales/linux"));
		 System.out.println(ej3.comprobarComando("rm manual_linux_v1"));
		 System.out.println(ej3.comprobarComando("mv "));
		 System.out.println(ej3.comprobarComando("cp manual_linux_v1 manuales/linux"));

	}

	public boolean comprobarComando(String cadena) {
		StringTokenizer st = new StringTokenizer(cadena);
		String cod=st.nextToken();
		switch (cod) {
		case "rm":
			if (st.hasMoreTokens()) {
				System.out.println("¿Está seguro de que desea borrar el fichero?");
				return true;
			}
			break;
		case "mv":
			if (st.hasMoreTokens()) {
				System.out.println("¿Está seguro de que desea borrar el fichero?");
				return true;
			}
			break;
		case "cp":
			if (st.hasMoreTokens())

				return true;

			break;
		case "mkdir":
			if (st.hasMoreTokens())

				return true;

			break;
		case "rmdir":
			if (st.hasMoreTokens())

				return true;

			break;
		}
		return false;
	}
}
