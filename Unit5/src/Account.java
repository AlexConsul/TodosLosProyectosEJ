

public abstract class Account {
	//estado
	private String cliente, nunCuenta;
	private double saldoCuenta,  tasaInteres;
	
	//Comportamiento
	public Account() {
		this.cliente="";
		this.nunCuenta="";
		this.saldoCuenta=0.0;
		this.tasaInteres=0.0;
	}
	
	public Account(String cliente,String numCuenta, double saldoCuenta, double tasaInteres) {
		this.cliente=cliente;
		this.nunCuenta=numCuenta;
		this.saldoCuenta=saldoCuenta;
		this.tasaInteres=tasaInteres;
	}
	
	
	public String getCliente() {
		return cliente;
	}

	public String getNunCuenta() {
		return nunCuenta;
	}

	public double getSaldoCuenta() {
		return saldoCuenta;
	}

	public double getTasaInteres() {
		return tasaInteres;
	}

	public abstract double calculateInterests();
	public abstract double getFinalBalance();
}
