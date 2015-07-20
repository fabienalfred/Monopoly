package monopoly;

public class Impot extends Case {
	public static final int seuil = 500;
	
	public Impot(String name) {
		super(name);
	}
	
	public Impot() {
		super("Impôts");
	}
	
	@Override
	public void arreter(Joueur joueur) throws SoldeNegatifException {
		int impot = (int) (joueur.getSolde() * .1);
		if(impot>seuil)
			impot = seuil;
		joueur.debiter(impot);
	}

}
