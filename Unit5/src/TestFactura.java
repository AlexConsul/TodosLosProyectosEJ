
public class TestFactura {
	public static void main(String[] args) {
		FacturaIVA fi=new FacturaIVA();
		FacturaIVAReducido fir=new FacturaIVAReducido();
		
		System.out.println("Importe con IVA:"+fi.getImporteIVA(10));
		System.out.println("Importe con IVA reducido:"+fir.getImporteIVA(10));
	}
}
