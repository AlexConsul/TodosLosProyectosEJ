

public class SavingAccount extends Account{

	private double tasaMantenimiento;
	
	public SavingAccount() {
		super();
		this.tasaMantenimiento=0.0;
	}
	
	public SavingAccount(String cliente,String numCuenta, double saldoCuenta, double tasaInteres, double tasaMantenimiento) {
		 super(cliente,numCuenta,saldoCuenta,tasaInteres);
		 this.tasaMantenimiento=tasaMantenimiento;
	}
	
	public double calculateInterests() {
		 
		return  super.getSaldoCuenta()*super.getTasaInteres();
	}

	
	public double getFinalBalance() {
		double balancefinal=getSaldoCuenta()+calculateInterests()-tasaMantenimiento;
		return  balancefinal;
	}

}
