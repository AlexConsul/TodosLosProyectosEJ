
public class Consumption {

	
	//Atributos
	private int kms;
	private double liters;
	private int vm;
	private double pgas;

	public Consumption() {
		kms = 0;
		liters = 0.0;
		vm = 0;
		pgas = 0.0;
	}

	public Consumption(int kms, double liters, int vm, double pgas) {
		this.kms = kms;
		this.liters = liters;
		this.pgas = pgas;
		this.vm = vm;

	}
	
	//Constructores

	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}

	public double getLiters() {
		return liters;
	}

	public void setLiters(double liters) {
		this.liters = liters;
	}

	public int getVm(int vm) {
		return vm;
	}

	public void setVm(int vm) {
		this.vm = vm;
	}

	public double getPgas(double pgas) {
		return pgas;
	}

	public void setPgas(double pgas) {
		this.pgas = pgas;
	}


	public double getTime() {		
		double time=kms/vm;		
		return time;
	}
	public double averageConsumption() {
		return kms/liters;
	}
	
	public double  averagePrice() {
		double precio = (liters/kms)*pgas;
		return precio;
	}

	
	//Operadores

	public static void main(String[]args) {
		
		Consumption c=new Consumption(1554,95,130,50);
		
		System.out.println("El tiempo usado ha sido " + c.getTime());		
		System.out.println("El coche consume " + c.averageConsumption());
		System.out.println("La media del coche cuesta " + c.averagePrice());
	}
}













