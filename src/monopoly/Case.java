package monopoly;

public class Case {
	private String nom;
	private Case next;
	
	public Case() {
		// TODO Auto-generated constructor stub
	}
	
	public Case(String name) {
		this.nom = name;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String name) {
		this.nom = name;
	}

	public Case getNext() {
		return next;
	}

	public void setNext(Case next) {
		this.next = next;
	}

	public void passer(Joueur joueur) {
		// TODO Auto-generated method stub
		
	}

	public void arreter(Joueur joueur) throws SoldeNegatifException {
		// TODO Auto-generated method stub
		
	}
}
