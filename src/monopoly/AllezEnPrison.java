package monopoly;

public class AllezEnPrison extends Case {

	/***** ATTRIBUTES *****/

	private Case prison;
	
	
	/***** CONSTRUCTORS *****/

	public AllezEnPrison(){
		super("Allez en Prison");
	}
	
	
	/***** METHODS *****/

	@Override
	public void arreter(Joueur joueur) {
		System.out.println(joueur.getNom()+" va en prison !");
		joueur.getPion().setPosition(joueur.getPlateau().getCases()[10]);
	}
	
	
	/***** GETTERS SETTERS *****/
	
	public void setPrison(Case prison){
		this.prison = prison;
	}
	
}
