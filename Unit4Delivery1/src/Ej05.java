
public class Ej05 {

	public static void main(String[] args) {
		Ej05 ej05 = new Ej05();
		int[] nums = { 30, 10, 10, 1, 1, 1, 2, 2 };
		int res = ej05.countGroups(nums);
		System.out.println(res);

	}

	public int countGroups(int[] nums) {
		int grupos = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				grupos++;
				while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
					i++;
				}
			}

		}

		return grupos;

	}
}
