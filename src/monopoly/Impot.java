package monopoly;

public class Impot extends Case {

	/***** ATTRIBUTES *****/
	
	public static final int seuil = 500;
	private Case parc;
	
	
	/***** CONSTRUCTORS *****/

	public Impot(String name) {
		super(name);
	}
	
	public Impot() {
		super("Impots");
	}
	
	
	/***** METHODS 
	 * @throws SoldeNegatifException *****/

	@Override
	public void arreter(Joueur joueur) throws SoldeNegatifException {
		int impot = (int) (joueur.getSolde() * .1);
		if(impot>seuil)
			impot = seuil;
		joueur.debiter(impot);
		((ParcGratuit) this.parc).addToCagnotte(impot);
	}
	
	
	/***** GETTERS SETTERS *****/
	
	public void setParc(Case parc){
		this.parc = parc;
	}

}
