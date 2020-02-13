
public class Ej02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ej02 ej2=new Ej02();
		int[] nums= {30,10,1,1,1};
		int res=ej2.maxTriple(nums);
		System.out.println(res);
		
	}
	
	public int maxTriple(int[] nums){
		int primero=nums[0];
		int ultimo=nums[nums.length-1];
		int medio=nums[(nums.length-1)/2];
		
		if(primero>ultimo &&primero>medio) {
			return primero;
		}
		
		else if(ultimo>primero &&ultimo>medio) {
			return ultimo;
		}
		else {
			return medio;
		}
		
		
	}

}
