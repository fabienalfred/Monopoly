package monopoly;

public class Propriete extends Case {

	/***** ATTRIBUTES *****/

	private int prixAchat;
	private int loyer;
	private Joueur owner;
	
	
	/***** CONSTRUCTORS *****/

	public Propriete(int num, String nom){
		super(num, nom);
		this.loyer = 20;
		this.prixAchat = num*10;
	}
	
	/***** METHODS *****/

	@Override
	public void arreter(Joueur joueur) {
		if(this.owner==null){						//pas de proprio
			if(joueur.getSolde()>= prixAchat){		//solde suffisant
				joueur.debiter(prixAchat);
				joueur.addPropriete(this);
				this.setOwner(joueur);
			}
		}
		else{										//deja un proprio
			if(joueur.equals(this.owner)){			//proprio = joueur
			}
			else{									//proprio = joueur different
				if(joueur.getSolde()>=loyer){
					joueur.debiter(loyer);
					this.owner.crediter(loyer);
				}
				else{
					System.out.println(joueur.getNom()+" a fait FAILLITE !!!");
				}
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
