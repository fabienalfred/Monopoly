package monopoly;

public class Pion {
	private Joueur joueur;
	private TypePion type;
	private Case position;
	
	public Pion(TypePion type) {
		this.type = type;
	}
	
	public Joueur getJoueur() {
		return joueur;
	}
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
	public Case getPosition() {
		return position;
	}
	public void setPosition(Case position) {
		this.position = position;
	}

	public void avancer(int r) throws SoldeNegatifException {
		for(int i=0;i<r-1;i++){
			position = position.getNext();
			position.passer(joueur);
		}
		position = position.getNext();
		position.arreter(joueur);
	}
	
	public String getName(){
		return type.toString();
	}
	
	
}
