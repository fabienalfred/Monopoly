package monopoly;

public class Gobelet {
	private De[] des = new De[2];
	
	public Gobelet() {
		des[0] = new De();
		des[1] = new De();
	}
	
	public int lancer(){
		return des[0].lancer() + des[1].lancer();
	}
	
	public boolean isDouble(){
		return des[0].getValue() == des[1].getValue();
	}
}
