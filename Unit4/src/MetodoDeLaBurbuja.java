
public class MetodoDeLaBurbuja {
	 public static int[] burbuja(int[] nums)
	    {
	      int auxiliar;
	      
	      for(int i = 2; i < nums.length; i++)
	      {
	        for(int j = 0;j < nums.length-i;j++)
	        {
	          if(nums[j] > nums[j+1])
	          {
	        	  auxiliar = nums[j];
	        	  nums[j] = nums[j+1];
	        	  nums[j+1] = auxiliar;
	          }   
	        }
	      }
	     
	      return nums;
	    }
	    
	    public static void main(String[] args) 
	    {
	      //Valores que tiene el arreglo desordenado.
	      int nums[] = generarArrayAleatorio(50);
	      pintarArray(nums);
	      int numsOrdenado[] = burbuja(nums);
	      System.out.println();
	      pintarArray(numsOrdenado);
	       
	    }
	    
	    public static void pintarArray(int[] nums) {
			
			System.out.print("{");
			for(int i=0;i<nums.length-1;i++) {
				
				System.out.print(nums[i]+", ");
			}
			
			System.out.print(nums[nums.length-1]);
			System.out.print("}");
		}
	    
		public static int[] generarArrayAleatorio(int n) {		
			int nums[] = new int[n];
			for (int x = 0; x < nums.length; x++) {
				
				nums[x]=(int) (Math.random() * 100) + 1;
				
			}	
			return nums;
			
		}

}
