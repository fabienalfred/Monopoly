package monopoly;

public class CaseDepart extends Case{

	/***** ATTRIBUTES *****/
	
	private final int bonus = 200;
	
	
	/***** CONSTRUCTORS *****/

	public CaseDepart(String name) {
		super(name);
	}
	
	public CaseDepart() {
		super("DEPART");
	}
	
	
	/***** METHODS *****/

	@Override
	public void passer(Joueur joueur){
		joueur.crediter(bonus);
		joueur.getPion().upNbToursPlateau();
	}
	
	@Override
	public void arreter(Joueur joueur){
		joueur.crediter(bonus*2);
		joueur.getPion().upNbToursPlateau();
	}
	
	
	/***** GETTERS SETTERS *****/
	
	public int getBonus(){
		return this.bonus;
	}
}
