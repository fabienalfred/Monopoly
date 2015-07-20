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
		joueur.getPion().setPosition(this.prison);
	}
	
	
	/***** GETTERS SETTERS *****/
	
	public Case getPrison(){
		return this.prison;
	}
	
	public void setPrison(Case prison){
		this.prison = prison;
	}
	
}
