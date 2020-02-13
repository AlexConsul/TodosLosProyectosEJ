
public class Ej01 {

	public static void main(String[] args) {
		Ej01 ej1 = new Ej01();

		int[] nums = { 1, 3, 4, 5 };
		System.out.println(ej1.unlucky(nums));
		
		int[] nums2 = { 1, 3, 4, 5 };
		System.out.println(ej1.unlucky(nums2));

		int[] nums3 = { 1, 1, 1 };
		System.out.println(ej1.unlucky(nums3));
		
		int[] nums4 = { 1, 1, 8, 1, 8, 5, 4, 1, 3 };
		System.out.println(ej1.unlucky(nums4));

	}

	public boolean unlucky(int[] nums) {
		boolean unlucky = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if ((nums[i] == 1) && (nums[i + 1] == 3)) {
				unlucky = true;
				break;
			}
			
		}
		return unlucky;

	}

}
