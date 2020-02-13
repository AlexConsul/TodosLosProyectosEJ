package Ej4y6;

public class FacturaIVAReducido extends Factura {
	
	public double getImporteIVA() {
		return 1.10*super.getImporte();
	}
}
