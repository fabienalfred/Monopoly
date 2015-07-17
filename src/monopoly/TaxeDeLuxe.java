package monopoly;

public class TaxeDeLuxe extends Case {

	/***** ATTRIBUTES *****/

	private final int MALUS = 100;
	
	
	/***** CONSTRUCTORS *****/

	public TaxeDeLuxe(){
		super(37, "Taxe de luxe");
	}
	
	public TaxeDeLuxe(int num, String nom){
		super(num, nom);
	}
	
	
	/***** METHODS *****/

	@Override
	public void arreter(Joueur joueur){
		joueur.debiter(MALUS);
	}
	
	
	/***** GETTERS SETTERS *****/
}
