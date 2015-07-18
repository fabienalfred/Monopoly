package monopoly;

public class Case {
	
	/***** ATTRIBUTES *****/

	private int numero;
	private String nom;
	private Case next;
	
	
	/***** CONSTRUCTORS *****/
	
	public Case(){
	}
	
	public Case(String nom){
		this.nom = nom;
	}
	
	public Case(int num, String nom){
		this.numero = num;
		this.nom = nom;
	}

	/***** METHODS *****/
	
	public void passer(Joueur joueur) {
		// TODO Auto-generated method stub
		
	}

	public void arreter(Joueur joueur) {
		// TODO Auto-generated method stub
		
	}
	
	
	/***** GETTERS SETTERS *****/
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Case getNext() {
		return next;
	}
	
	public void setNext(Case next) {
		this.next = next;
	}
	
}
