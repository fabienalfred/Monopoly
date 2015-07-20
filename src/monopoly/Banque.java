package monopoly;

public class Banque {

	/***** ATTRIBUTES *****/

	private int solde = 1_000_000;

	
	/***** CONSTRUCTORS *****/
	public Banque() {
	}

	
	/***** METHODS *****/

	public void crediter(int somme) {
		this.solde += somme;
	}

	public void debiter(int somme) {
		this.solde -= somme;
	}

	
	/***** GETTERS SETTERS *****/

	public int getSolde() {
		return this.solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

}
