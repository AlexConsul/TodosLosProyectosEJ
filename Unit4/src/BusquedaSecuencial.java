public class BusquedaSecuencial {

	public static void main(String[] args) {
		int [] nums= {2, 1, 5, 6, 7,8};
		
		int res=busquedaSec(nums, 6);
		System.out.println(res);
		
	}
	
	public static int busquedaSec(int [] nums, int key) {
		boolean b=false;
		int aux=-1;
		for (int i=0; i<nums.length;i++) {
			
			if(nums[i]==key) {
				b=true;
				aux=i;
				break;
			}
		}
		
	 return aux;
		
	}
}
