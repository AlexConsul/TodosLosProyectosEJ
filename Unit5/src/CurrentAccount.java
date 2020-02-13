
public class CurrentAccount extends Account {
	private int numtrans;
	private double preciotrans;
	
	public CurrentAccount() {
		this.numtrans=0;
		this.preciotrans=0.0;
	}
	
	public CurrentAccount(String cliente,String numCuenta,double saldoCuenta, double tasaInteres,int numtrans,double preciotrans) {
		super(cliente,numCuenta,saldoCuenta,tasaInteres);
		this.numtrans=numtrans;
		this.preciotrans=preciotrans;
	}

	public double transactionReceipt() {
		return numtrans*preciotrans;
	}

	@Override
	public double calculateInterests() {
		if(getSaldoCuenta()>=1500000) {
			return super.getSaldoCuenta()*0.05;
		} else {
			return super.getSaldoCuenta()*0.01;
		}
	}

	@Override
	public double getFinalBalance() {
		double tasaMantenimiento=0.0;
		double balancefinal=getSaldoCuenta()+calculateInterests()-tasaMantenimiento;
		return  balancefinal-transactionReceipt();
	}
}
