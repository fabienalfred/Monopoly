package monopoly;

public class Impot extends Case {

	/***** ATTRIBUTES *****/

	private final int PCT = 10;
	
	
	/***** CONSTRUCTORS *****/

	public Impot(){
		super(4, "Impot");
	}
	
	public Impot(int num, String nom){
		super(num, nom);
	}
	
	
	/***** METHODS 
	 * @throws SoldeNegatifException *****/

	@Override
	public void arreter(Joueur joueur) throws SoldeNegatifException{
		joueur.debiter(joueur.getSolde()*PCT/100);
	}
	
	/***** GETTERS SETTERS *****/
	
	public int getPCT(){
		return this.PCT;
	}
}
