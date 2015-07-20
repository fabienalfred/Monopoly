package monopoly;

public class Depart extends Case {
	private static final int somme = 200;
	
	public Depart(String name) {
		super(name);
	}
	
	public Depart() {
		super("DEPART");
	}

	@Override
	public void arreter(Joueur joueur) {
		joueur.crediter(somme*2);
	}
	
	@Override
	public void passer(Joueur joueur) {
		joueur.crediter(somme);
	}
}
