public class BusquedaBinaria {

	public static void main(String[] args) {
		int [] nums= {1, 2, 5, 6, 7,8};
		
		int res=busquedaBin(nums, 3);
		System.out.println(res);
		
	}
	
	public static int busquedaBin(int [] nums, int key) {
		boolean b=false;
		int aux=-1;
		int sup=nums.length-1, inf=0, med=0;
		 
		while (sup>=inf) {	
			
			
			med=(sup+inf)/2;
			if(nums[med]==key) {
				b=true;
				aux=key;
				break;
			}else if (nums[med]>key) {
				sup=med-1;				
			}else {
				inf=med+1;
			}
		}
		
	 return aux;
		
	}
}
