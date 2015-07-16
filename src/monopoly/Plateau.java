package monopoly;

public class Plateau {

	/***** ATTRIBUTES *****/
	
	final private Case[] cases = new Case[40];
	
	
	/***** CONSTRUCTORS *****/

	public Plateau() {
		for(int i=0 ; i<40 ; i++){
			Case c = new Case();
			c.setNumero(i+1);
			this.cases[i] = c;
		}
	}
	
	
	/***** METHODS *****/

	/***** GETTERS SETTERS *****/
	
	public Case[] getCases() {
		return cases;
	}
	
}
