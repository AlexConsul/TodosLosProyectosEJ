

public class OrdenacionInsercion {
	 public static int[] ordInsercion(int[] nums)
	    {
	      int auxiliar;
	      
	      for (int i = 1; i < nums.length; i++){	// ¡Ojo! Empezamos en 1
	    	  auxiliar = nums[i];	// Guardamos el valor a ordenar.
				int j = i - 1;
				while ( (j >= 0) && nums[j] > auxiliar )	// Siempre que sea mayor que aux.
									// ordenamos de menor a mayor.
					nums[j+1] = nums[j--];	// Trasladamos el valor y movemos el indice.
				nums [j+1] = auxiliar;	// Ponemos el valor a ordenar en su sitio.
			}	
	     
	      return nums;
	    }
	    
	    public static void main(String[] args) 
	    {
	      //Valores que tiene el arreglo desordenado.
	      int nums[] = generarArrayAleatorio(50);
	      pintarArray(nums);
	      int numsOrdenado[] = ordInsercion(nums);
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
