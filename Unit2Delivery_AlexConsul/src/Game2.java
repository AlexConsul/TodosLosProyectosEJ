public class Game2 {
	//Atributos
	public int livesLeft; //Nunca hay que hacerlo as�
	
	//Constructor
	public Game2(int livesLeft) {
		this.livesLeft=livesLeft;
	}
	//Getter
	public int getLivesLeft() {
		return livesLeft;
	}

	public void setLivesLeft(int livesLeft) {
		this.livesLeft = livesLeft;
	}
	
	public static void main(String[] args) {
		Game2 g1=new Game2(5);
		System.out.println(g1.getLivesLeft());
		g1.livesLeft=g1.livesLeft-1; //Nunca hay que hacerlo as�
		System.out.println(g1.getLivesLeft());
	}
	
	
	
}
