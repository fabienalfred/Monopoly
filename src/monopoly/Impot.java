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
	
	
	/***** METHODS *****/

	@Override
	public void arreter(Joueur joueur){
		joueur.debiter(joueur.getSolde()*PCT/100);
	}
	
	/***** GETTERS SETTERS *****/
}
