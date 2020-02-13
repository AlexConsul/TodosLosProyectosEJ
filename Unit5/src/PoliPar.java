
public class PoliPar {
	public static void main(String[] args) {
		GatoPar g=new GatoPar();
		hazleHablar(g);
		CucuPar c=new CucuPar();
		hazleHablar(c);
	}

	static void hazleHablar(Parlanchin sujeto) {
		sujeto.habla();
	}
}
