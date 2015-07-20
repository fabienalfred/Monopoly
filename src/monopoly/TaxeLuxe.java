package monopoly;

public class TaxeLuxe extends Case {

	/***** ATTRIBUTES *****/

	private final int MALUS = 100;
	
	
	/***** CONSTRUCTORS *****/

	public TaxeLuxe(){
		super("Taxe de luxe");
	}
	
	public TaxeLuxe(int num, String nom){
		super(nom);
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
