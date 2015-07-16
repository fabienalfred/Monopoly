package monopoly;

public class Pion {
	
	/***** ATTRIBUTES *****/
	
	private Joueur joueur;
	private TypePion type;
	private Case position;
	
	
	/***** METHODS *****/
	
	public void avancer(int resultat){
		for(int i=0 ; i<resultat-1 ; i++){
			position = position.getNext();
			position.passer(joueur);
		}
		position = position.getNext();
		position.arreter(joueur);
	}
	
	
	/***** GETTERS SETTERS *****/
	
	public Joueur getJoueur() {
		return joueur;
	}
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
	public TypePion getType() {
		return type;
	}
	public void setType(TypePion type) {
		this.type = type;
	}
	public Case getPosition() {
		return position;
	}
	public void setPosition(Case position) {
		this.position = position;
	}
	
	
}
