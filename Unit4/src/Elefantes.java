import java.util.StringTokenizer;

public class Elefantes {
	public static int contarElefantes(String elefantes) {
		int aux = 0; 
		int j = 0;
		int total = 0;
		int delim = elefantes.indexOf('#') + 1;
		String pesos = elefantes.substring(delim);
		String ele = elefantes.substring(0, elefantes.indexOf('#'));
		String eletrim = ele.trim();
		Integer eleN = Integer.valueOf(eletrim);
		//
		StringTokenizer st = new StringTokenizer(pesos, " ");
		int npesos = st.countTokens();
		String[] stdatos = new String[npesos];

		int nSTD = stdatos.length;
		int i = 0;
		Integer[] datos = new Integer[nSTD];

		int nD = datos.length;
		for (i = 0; i < nSTD; i++) {
			stdatos[i] = st.nextToken();
			datos[i] = Integer.valueOf(stdatos[i]);

		}

		for (j = 0; j < nD; j++) {
			total += datos[j];
		}

		if (eleN < total) {
			for (j = 0; j < nD - 1; j++) {
				total += datos[j];
				if (eleN >= total) {
					aux = nD - 1;
				} else {
					aux = nD - 2;
				}

			}
		} else if (eleN >= total) {
			aux = nD;
		}

		return aux;
	}

	public static void main(String[] args) {
		Elefantes e1 = new Elefantes();
		System.out.println("Se pueden subir: " + e1.contarElefantes("10#1 2 3 4 5") + " Elefantes");
		System.out.println("Se pueden subir: " + e1.contarElefantes("20#3 3") + " Elefantes");
		System.out.println("Se pueden subir: " + e1.contarElefantes("30#10 10 20 10") + " Elefantes");
	}
}
