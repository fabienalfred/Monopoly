package monopoly;

public class Joueur {
	
	/***** ATTRIBUTES *****/
	
	private String nom;
	private Pion pion;
	private int solde;
	
	
	/***** CONSTRUCTORS *****/
	
	
	
	/***** METHODS *****/
	
	public void jouer(Gobelet gobelet){
		int resultat = gobelet.lancer();
		pion.avancer(resultat);
	}
	
	public void crediter(int somme){
		
	}
	
	public void debiter(int somme){
		
	}
	
	
	/***** GETTERS SETTERS *****/
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getSolde() {
		return solde;
	}
	
	public void setSolde(int solde) {
		this.solde = solde;
	}
	
}
