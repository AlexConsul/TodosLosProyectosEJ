package Ej4y6;

public class FacturaIVA extends Factura {
	
	public double getImporteIVA() {
		return 1.21*super.getImporte();
	}

 
}
