package monopoly;

public class Depart extends Case{

	/***** ATTRIBUTES *****/
	
	private final int BONUS = 200;
	
	
	/***** CONSTRUCTORS *****/

	public Depart(String name) {
		super(name);
	}
	
	public Depart() {
		super("DEPART");
	}
	
	
	/***** METHODS *****/

	@Override
	public void passer(Joueur joueur){
		joueur.crediter(BONUS);
	}
	
	@Override
	public void arreter(Joueur joueur){
		joueur.crediter(BONUS*2);
	}
	
	
	/***** GETTERS SETTERS *****/
	
	public int getBonus(){
		return this.BONUS;
	}
}
