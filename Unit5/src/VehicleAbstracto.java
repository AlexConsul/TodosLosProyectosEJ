

public  abstract class VehicleAbstracto {

	private int peso;
	public void setPeso(int p) {peso=p;}
	public abstract int getVelocidadActual();
	
	public static void main (String [] args) {
		//VehicleAbstracto va=new VehicleAbstracto(); 
		//No podemos crear una instancia porque se trata de una clase abstracta
	}
}
