package monopoly;

public class ParcGratuit extends Case{

	/***** ATTRIBUTES *****/

	private int gagnote;
	
	
	/***** CONSTRUCTORS *****/

	public ParcGratuit(){
		super(20, "Parc Gratuit");
	}
	
	
	/***** METHODS *****/

	@Override
	public void arreter(Joueur joueur) {
		joueur.crediter(gagnote);
		this.setGagnote(0);
	}

	
	/***** GETTERS SETTERS *****/

	public int getGagnote() {
		return this.gagnote;
	}


	public void setGagnote(int gagnote) {
		this.gagnote = gagnote;
	}
	
}
