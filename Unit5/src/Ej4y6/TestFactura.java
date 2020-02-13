package Ej4y6;

public class TestFactura {
	public static void main(String[] args) {
		FacturaIVA fi=new FacturaIVA();
		fi.setId(1);
		fi.setImporte(50.0);
		System.out.println("El id es " + fi.getId() + " y el importe con IVA:"+fi.getImporteIVA());
		
		FacturaIVAReducido fir=new FacturaIVAReducido();
		fir.setId(2);
		fir.setImporte(30.0);		
		System.out.println("El id es " + fir.getId() + " y el importe con IVA reducido:"+fir.getImporteIVA());
	}
}
