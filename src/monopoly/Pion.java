package monopoly;

public class Pion {
	
	/***** ATTRIBUTES *****/
	
	private Joueur joueur;
	private TypePion type;
	private Case position;
	private int nbToursPlateau=1 ;
	
	
	/***** CONSTRUCTORS *****/
	public Pion(TypePion type){
		this.type = type;
	}
	
	
	/***** METHODS 
	 * @throws SoldeNegatifException *****/
	
	public void avancer(int r) throws SoldeNegatifException {
		for(int i=0;i<r-1;i++){
			position = position.getNext();
			position.passer(joueur);
		}
		position = position.getNext();
		position.arreter(joueur);
	}

	public void goToPrison() {
		while(!(this.position instanceof Visite)){
			this.position = this.position.getNext();
		}
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
	
	public void upNbToursPlateau(){
		this.nbToursPlateau ++;
	}
	public int getNbToursPlateau() {
		return nbToursPlateau;
	}
	
	public String getName(){
		return type.toString();
	}
	
}
