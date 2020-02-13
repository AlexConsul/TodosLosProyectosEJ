public class Ej06 {
	public int encontrarBrecha(int[] nums) {
		int brecha = Math.abs(nums[0] - nums[1]);
			for (int i = 1; i <= nums.length - 2; i++) {
				int n = Math.abs(nums[i] - nums[i + 1]);
				if (n < brecha) {
					brecha = n;
		}	
	}
				return brecha;
}

	public static void main(String[] args) {
		
		// Prueba1
		Ej06 p1 = new Ej06();
		int[] nums = { 1, 2, 4, 5, 8, 7 };
		int resultado = p1.encontrarBrecha(nums);
		System.out.println(resultado);
		
		// Prueba2
		Ej06 p2 = new Ej06();
		int[] nums2 = { 3, 6, 8, 9, 13 };
		int resultado2 = p2.encontrarBrecha(nums2);
		System.out.println(resultado2);
	}
}
