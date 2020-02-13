
public class FacturaIVAReducido extends Factura {
	@Override
	public double getImporteIVA(double importe) {
		return 1.10*importe;
	}
}
