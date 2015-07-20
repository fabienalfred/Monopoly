package monopoly;

public class ParcGratuit extends Case{

	/***** ATTRIBUTES *****/

	private int cagnotte;
	
	
	/***** CONSTRUCTORS *****/

	public ParcGratuit(){
		super(20, "Parc Gratuit");
	}
	
	
	/***** METHODS *****/

	@Override
	public void arreter(Joueur joueur) {
		joueur.crediter(cagnotte);
		this.setCagnotte(0);
	}

	
	/***** GETTERS SETTERS *****/

	public int getCagnotte() {
		return this.cagnotte;
	}


	public void setCagnotte(int cagnotte) {
		this.cagnotte = cagnotte;
	}
	
}
