package monopoly;

public class Rue extends Propriete {

	/***** ATTRIBUTES *****/

	private String couleur;
	
	
	/***** CONSTRUCTORS *****/

	public Rue() {
		// TODO Auto-generated constructor stub
	}
	public Rue(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
	/***** METHODS *****/
	
	
	/***** GETTERS SETTERS *****/

	public String getCouleur() {
		return this.couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
}
