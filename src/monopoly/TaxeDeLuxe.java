package monopoly;

public class TaxeDeLuxe extends Case {

	/***** ATTRIBUTES *****/

	private final int taxe = 100;
	private Case parc;
	
	
	/***** CONSTRUCTORS *****/

	public TaxeDeLuxe(){
		super("Taxe de luxe");
	}
	
	public TaxeDeLuxe(int num, String nom){
		super(nom);
	}
	
	
	/***** METHODS 
	 * @throws SoldeNegatifException *****/

	@Override
	public void arreter(Joueur joueur) throws SoldeNegatifException{
		joueur.debiter(taxe);
		((ParcGratuit) this.parc).addToCagnotte(taxe);
	}
	
	
	/***** GETTERS SETTERS *****/
	
	public int getMalus(){
		return this.taxe;
	}
	
	public void setParc(Case parc){
		this.parc = parc;
	}
}
