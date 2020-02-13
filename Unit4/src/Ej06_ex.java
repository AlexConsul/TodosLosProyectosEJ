public class Ej06_ex {
	public static void main(String[] args) {
		Ej06_ex ej6=new Ej06_ex();
		int[] nums= {1,2,4,5,8,7}; //En este caso es 1
		int res=ej6.matriz(nums);
		System.out.println(res);
		
		int[] nums2= {20,2,15,5}; //En este otro caso es 10
		int res2=ej6.matriz(nums2);
		System.out.println(res2);
	}
	
	public int matriz(int[]nums) {
/*De un array tomamos la diferencia de los 
  dos primeros n�meros como la m�nima:*/
		int min=Math.abs(nums[0]-nums[1]);
		
/*Despu�s creamos un bucle que recorra todo 
  el array y saque su valor absoluto:*/
		for(int i=1; i<=nums.length-2;i++) {
			int n=Math.abs(nums[i]-nums[i+1]);
			
/*Por �ltimo, ponemos que si el n�mero absoluto 
  es menor que el m�nimo sea este el nuevo m�nimo:*/
			if(n<min) {
				min=n;
			}
/*Y sacar� el m�nimo, ya sea el que hemos puesto al 
  inicio o el que sale del if:*/
		}
		return min;
	}
}