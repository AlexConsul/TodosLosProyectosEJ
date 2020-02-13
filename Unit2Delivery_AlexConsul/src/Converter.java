public class Converter {
	//Atributos
	private double cantidad;
	private char tipo; //M K
	
	//Constructores
	/*public Converter(double cantidad, char tipo) {
		this.cantidad=cantidad;
		this.tipo=tipo;
	}
	
	public Converter() {
		this.cantidad=0;
		this.tipo='M';}
	//Getters and Setters
	*/
	


	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	
	//Métodos
	
	public void milesToKms(int miles){
		cantidad=miles*1.6;
		tipo='K';
	}
	
	public double kmToMiles(int km){
		cantidad=km/1.6;
		tipo='M';
		return cantidad;
	}
	
	public static void main (String[] args) {
		
		Converter c1=new Converter();
		c1.milesToKms(600);
		System.out.println(c1.getCantidad());
		
		Converter c2=new Converter();
		
		System.out.println(c2.kmToMiles(50));
	}
}
