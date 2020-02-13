
public class Ej03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ej03 ej3=new Ej03();
		int n=200;
		int[] nums=ej3.fizzArray(n);
		 
		pintarArray(nums);
	}
	
	public int[] fizzArray(int n) {
				
		int[] nums;
		nums = new int[n] ;
		for (int i=0;i<n;i++) {
			nums[i] = i;
		}
	 
		
		return nums;
	}
	
	public static void pintarArray(int[] nums) {
		
		System.out.print("{");
		for(int i=0;i<nums.length-1;i++) {
			
			System.out.print(nums[i]+", ");
		}
		
		System.out.print(nums[nums.length-1]);
		System.out.print("}");
	}
}
