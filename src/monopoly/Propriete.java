package monopoly;

public class Propriete extends Case {

	/***** ATTRIBUTES *****/

	private int prixAchat;
	private int loyer;
	private Joueur owner;
	
	
	/***** CONSTRUCTORS *****/

	public Propriete(int num, String nom){
		super(num, nom);
		this.loyer = num*5;
		this.prixAchat = num*10;
	}
	
	
	/***** METHODS *****/

	@Override
	public void arreter(Joueur joueur) {
		if(this.owner==null){				// pas de proprietaire
			if(joueur.veutAcheter(this)){
				joueur.debiter(prixAchat);
				joueur.addPropriete(this);
				this.setOwner(joueur);
				System.out.println(joueur.getNom()+" achete "+this.getNom()+" ("+this.getPrixAchat()+"€)");
			}
			else
				System.out.println(joueur.getNom()+" refuse d'acheter "+this.getNom()+" ("+this.getPrixAchat()+"€)");
		}
		else if(this.owner!=joueur){		// proprietaire different du joueur
			if(joueur.getSolde()>=loyer){	// le joueur peut payer le loyer
				joueur.debiter(loyer);
				this.owner.crediter(loyer);
				System.out.println(joueur.getNom()+" paye "+this.getLoyer()+"€ a "+this.owner.getNom());
			}
			else{							// le joueur ne peut pas payer le loyer
				joueur.remettreEnJeu();
				System.out.println(joueur.getNom()+" n'a pas assez d'argent pour payer "
									+this.getLoyer()+"€ a "+this.owner.getNom()
									+ " => FAILLITE !!!");
				System.exit(0);
			}
		}
	}
	
	
	/***** GETTERS SETTERS *****/

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
	
	public Joueur getOwner() {
		return owner;
	}
	public void setOwner(Joueur owner) {
		this.owner = owner;
	}
}
