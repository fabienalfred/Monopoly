package monopoly;

public class ParcGratuit extends Case{

	/***** ATTRIBUTES *****/

	private int cagnotte;
	
	
	/***** CONSTRUCTORS *****/

	public ParcGratuit(){
		super("Parc Gratuit");
	}
	
	
	/***** METHODS *****/

	@Override
	public void arreter(Joueur joueur) {
		System.out.println(joueur.getNom()+" remporte "+cagnotte+"€ !");
		joueur.crediter(cagnotte);
		this.setCagnotte(0);
	}

	public void addToCagnotte(int somme) {
		this.cagnotte += somme;
	}
	
	
	/***** GETTERS SETTERS *****/

	public int getCagnotte() {
		return this.cagnotte;
	}

	public void setCagnotte(int cagnotte) {
		this.cagnotte = cagnotte;
	}
	
}
