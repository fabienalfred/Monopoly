package monopoly;

public class TaxeDeLuxe extends Case{
	private static final int somme = 100;
	
	public TaxeDeLuxe(String name) {
		super(name);
	}
	
	public TaxeDeLuxe() {
		super("Taxe de luxe");
	}
	
	@Override
	public void arreter(Joueur joueur) throws SoldeNegatifException {
		joueur.debiter(somme);
	}

}
