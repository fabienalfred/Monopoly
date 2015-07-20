package monopoly;

public class TaxeLuxe extends Case{
	private static final int somme = 100;
	
	public TaxeLuxe(String name) {
		super(name);
	}
	
	public TaxeLuxe() {
		super("Taxe de luxe");
	}
	
	@Override
	public void arreter(Joueur joueur) throws SoldeNegatifException {
		joueur.debiter(somme);
	}

}
