public class EjStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		StringBuffer sb2=new StringBuffer(8);
		StringBuffer sb3=new StringBuffer("hola que tal");
		
		
		System.out.println(sb.length());
		System.out.println(sb2.length());
		System.out.println(sb3.length());
	
		sb.append("hola");
		System.out.println(sb.length());
		sb.insert(3, "hola");
		
		System.out.println(sb.toString());
		
		sb.delete(0,2);
		System.out.println(sb.toString());
		sb.deleteCharAt(2);
		System.out.println(sb.toString());
		sb.setCharAt(3, 'R');
		System.out.println(sb.toString());
		sb.replace(0, 2, "adios");
		System.out.println(sb.toString());
		
	}
}