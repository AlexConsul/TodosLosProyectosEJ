public class Ej04 {
	
	// Hacemos un bucle que recorra el array y que mueva desde el primero hasta el ultimo
	public int[] moverIzquierda(int[] nums) {
		int ultimo = nums[0];
			for (int i = 0; i < nums.length - 1; i++) {
				nums[i] = nums[i + 1];
			}
			nums[nums.length - 1] = ultimo;
			return nums;
}

	// Método para el array
	
	public static void pintarArray(int[] nums) {
		System.out.print("{");
		for (int i = 0; i < nums.length - 1; i++) {
			System.out.print(nums[i] + ", ");
		}

		System.out.print(nums[nums.length - 1]);
		System.out.print("}");
}

	public static void main(String[] args) {
		
		// Prueba 1
		Ej04 p1 = new Ej04();
		int[] nums = { 6, 2, 5, 3 };
		int[] resultado = p1.moverIzquierda(nums);
		pintarArray(resultado);
		System.out.println("");
		
		// Prueba 2
		Ej04 p2 = new Ej04();
		int[] nums2 = { 2, 1 };
		int[] resultado2 = p2.moverIzquierda(nums2);
		pintarArray(resultado2);
		System.out.println("");
		
		// Prueba 3
		Ej04 p3 = new Ej04();
		int[] nums3 = { 1 };
		int[] resultado3 = p3.moverIzquierda(nums3);
		pintarArray(resultado3);
	}
}
