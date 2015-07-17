package monopoly;

public class CaseDepart extends Case{

	/***** ATTRIBUTES *****/
	private final int BONUS = 200;
	
	/***** CONSTRUCTORS *****/
	
	public  CaseDepart() {
		super(0, "Case depart");
	}
	
	public CaseDepart(int num, String nom) {
		super(num, nom);
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
}
