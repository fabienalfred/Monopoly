package monopoly;

public class AllezEnPrison extends Case {

	/***** ATTRIBUTES *****/
	
	
	/***** CONSTRUCTORS *****/

	public AllezEnPrison(){
		super("Allez en Prison");
	}
	
	
	/***** METHODS *****/

	@Override
	public void arreter(Joueur joueur) {
		System.out.print(joueur.getNom()+" va en prison !");
		joueur.getPion().goToPrison();
		joueur.setEnPrison(true);
	}
	
	
	/***** GETTERS SETTERS *****/
	
}
