package monopoly;

public class Propriete extends Case {

	/***** ATTRIBUTES *****/

	private int prixAchat;
	private int loyer;
	private Joueur owner;
	
	
	/***** CONSTRUCTORS *****/

	public Propriete() {
	}
	
	public Propriete(String nom){
		super(nom);
	}
	
	
	/***** METHODS 
	 * @throws SoldeNegatifException *****/

	@Override
	public void arreter(Joueur joueur) throws SoldeNegatifException {
		if(this.owner==null){				// pas de proprietaire
			if(joueur.veutAcheter(this)){
				joueur.debiter(prixAchat);
				joueur.addPropriete(this);
				this.setOwner(joueur);
				System.out.print(joueur.getNom()+" achete "+this.getNom()+" ("+this.getPrixAchat()+")");
			}
			else
				System.out.print(joueur.getNom()+" refuse d'acheter "+this.getNom()+" ("+this.getPrixAchat()+"€)");
		}
		else if(this.owner!=joueur){		// proprietaire different du joueur
			joueur.debiter(loyer);
			this.owner.crediter(loyer);
			System.out.print(joueur.getNom()+" paye "+this.getLoyer()+"€ a "+this.owner.getNom());
			
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
