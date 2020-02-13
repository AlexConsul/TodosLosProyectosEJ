
public class FacturaIVA extends Factura {
	@Override
	public double getImporteIVA(double importe) {
		return 1.21*importe;
	}
}
