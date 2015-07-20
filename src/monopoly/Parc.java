package monopoly;

public class Parc extends Case{

	/***** ATTRIBUTES *****/

	private int cagnotte;
	
	
	/***** CONSTRUCTORS *****/

	public Parc(){
		super("Parc Gratuit");
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
