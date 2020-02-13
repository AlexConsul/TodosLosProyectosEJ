
public class EjMatrices {

	public static void main(String[] args) {

		int[][] matriz = { { 1, 4, 5 }, { 6, 2, 5 } };
		System.out.println("Número de filas: " + matriz.length); // Número de filas
		System.out.println("Longitud de la fila 0: " + matriz[0].length); // Longitud de la fila 0

		pintarMatriz(matriz);

		int[][] matriz2 = new int[6][6];
		pintarMatriz(matriz2);

		matriz2[0][0] = 100;
		pintarMatriz(matriz2);

		int[][] matriz3 = { { 0, 0 }, { 1, 1, 1 }, { 2, 2, 2, 2 } };

		pintarMatriz(matriz3);
		
		
		int[][] matriz4 = new int[5][8];
		pintarMatriz(matriz4);

	}

	public static void pintarMatriz(int[][] mnums) {
		for (int x = 0; x < mnums.length; x++) {
			for (int y = 0; y < mnums[x].length; y++) {
				System.out.print(" | " + mnums[x][y] + " | ");
			}
			System.out.println("\n");

		}

	}

}
