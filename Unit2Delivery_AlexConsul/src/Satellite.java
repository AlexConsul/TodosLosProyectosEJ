public class Satellite {
	//atributos
	private String meridiano;
	private String paralelo;
	private double distanciaATierra;
	
	//Constructor
	public Satellite(String meridiano,String paralelo,double distanciaATierra) {
		this.meridiano=meridiano;
		this.paralelo=paralelo;
		this.distanciaATierra=distanciaATierra;
		
	}
	
	//Getter and Setters
	
	//método
	public void setPosition(String meridiano,String paralelo) {
		this.meridiano=meridiano;
		this.paralelo=paralelo;
	}
	
	public void pintarPosicion() {
		System.out.println("Meridiano: "+meridiano+" Paralelo: "+paralelo+" Distancia a Tierra: "+distanciaATierra);
	}
	
	//Pruebas de usuario
	public static void main(String[] args) {
		Satellite s=new Satellite("30º 50'", "15º 5'",40);
		s.pintarPosicion();
		
	}
	
}
