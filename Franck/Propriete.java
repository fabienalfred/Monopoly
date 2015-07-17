package monopoly;

public class Propriete extends Case {
	private Joueur proprietaire;
	private int prixAchat = 200;
	private int loyer=20;

	public Propriete(String name) {
		super(name);
	}

	@Override
	public void arreter(Joueur joueur) {
		if(proprietaire==null){
			System.out.println(">>> proprosition d'achat pour "+joueur.getName()+" sur "+this.getName());
			if(joueur.veutAcheter(this)){
				proprietaire = joueur;
				joueur.add(this);
				joueur.debiter(getPrixAchat());
				System.out.println(">>> ACHAT : "+joueur.getName()+" achète "+this.getName()+" pour "+getPrixAchat()+" €");
			}
		}else if(proprietaire!=joueur){
			proprietaire.crediter(getLoyer());
			joueur.debiter(getLoyer());
			System.out.println(">>> LOYER : "+joueur.getName()+" verse à "+proprietaire.getName()+" une loyer de "+getLoyer());
		}
	}

	public Joueur getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Joueur proprietaire) {
		this.proprietaire = proprietaire;
	}

	public int getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}

	public int getLoyer() {
		return loyer;
	}

	public void setLoyer(int loyer) {
		this.loyer = loyer;
	}
	
}
