package monopoly;

public class Banque {

	/***** ATTRIBUTES *****/

	private int solde = 10000;
	
	
	/***** CONSTRUCTORS *****/

		
	/***** METHODS *****/

	public void crediter(int somme){
		this.setSolde(this.getSolde()+somme);
	}
	
	public void debiter(int somme){
		this.setSolde(this.getSolde()-somme);
	}
	
	
	/***** GETTERS SETTERS *****/

	public int getSolde() {
		return this.solde;
	}


	public void setSolde(int solde) {
		this.solde = solde;
	}
	
}
