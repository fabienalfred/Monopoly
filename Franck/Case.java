package monopoly;

public class Case {
	private String name;
	private Case next;
	
	public Case() {
		// TODO Auto-generated constructor stub
	}
	
	public Case(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
