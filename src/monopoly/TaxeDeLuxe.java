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
	
	
	/***** METHODS 
	 * @throws SoldeNegatifException *****/

	@Override
	public void arreter(Joueur joueur) throws SoldeNegatifException{
		joueur.debiter(MALUS);
	}
	
	
	/***** GETTERS SETTERS *****/
	
	public int getMalus(){
		return this.MALUS;
	}
}
