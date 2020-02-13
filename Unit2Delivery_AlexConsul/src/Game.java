public class Game {
	//Atributos
	public int livesLeft; //Nunca hay que hacerlo así
	
	//Constructor
	public Game(int livesLeft) {
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
		Game g1=new Game(5);
		System.out.println(g1.getLivesLeft());
		g1.livesLeft=g1.livesLeft-1; //Nunca hay que hacerlo así
		System.out.println(g1.getLivesLeft());
	}
	
	
	
}
