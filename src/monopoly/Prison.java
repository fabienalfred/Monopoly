package monopoly;

public class Prison extends Case {

	/***** ATTRIBUTES *****/

	/***** CONSTRUCTORS *****/

	public Prison(){
		super("Allez en Prison");
	}
	
	
	/***** METHODS *****/

	@Override
	public void arreter(Joueur joueur) {
		System.out.println(joueur.getNom()+" va en prison !");
		joueur.getPion().setPosition(joueur.getPlateau().getCases()[10]);
	}
	
	
	/***** GETTERS SETTERS *****/
}
