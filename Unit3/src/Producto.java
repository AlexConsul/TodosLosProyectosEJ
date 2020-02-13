
public class Producto {
	
	//Atributos
	private String titulo;
	private String descripcion;
	private double precio;
	
	
	//Método
	public Producto(String titulo, String descripcion, int precio) { // Constructor asignado por parametros
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.precio = precio;
		
	}
	public Producto() { //Constructor con datos por defecto
		titulo = "La prenda";
		descripcion ="Marca de ropa";
		precio = 0.0;
		
	}
	public String getTitulo() { 
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	public void settituloprecior(String titulo, float precio) { //Constructor con los parámetros indicados 
		this.titulo = titulo;
		this.precio = precio;
	}
	
	public String toString() {
		return "El titulo de " + titulo + " es " + descripcion + " y cuesta " + precio; 
	}
	
	public double oferta(int descuento) {
		return precio*(1-descuento/100.0);
		
	}
	public static void main(String[] args) {
		Producto e1 = new Producto("Pantalones", "Jack&Jones", 45);
		Producto e2 = new Producto("Camiseta", "Inside", 20);
		double res=e1.oferta(20);
		double res2=e2.oferta(20);
		System.out.println(res);
		System.out.println(res2);
	}
}