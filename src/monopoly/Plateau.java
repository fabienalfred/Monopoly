package monopoly;

public class Plateau {

	/***** ATTRIBUTES *****/
	
	final private Case[] cases = new Case[40];
	
	
	/***** CONSTRUCTORS *****/

	public Plateau() {
		for(int i=0 ; i<cases.length ; i++){
			initialiserCases();
			lierCases();
		}
	}
	
	
	/***** METHODS *****/

	public void initialiserCases(){
		for(int i=0 ; i<cases.length ; i++){
			Case c = null;
			switch(i){
			case 0 :
				c = new CaseDepart();
				break;
			case 4 :
				c = new Impot();
				break;
			case 30 :
				c = new AllezEnPrison();
				break;
			case 37 :
				c = new TaxeDeLuxe();
				break;
			case 2 : case 7 : case 10 : case 17 : case 20 : case 22 : case 33 : case 36 :
				c = new Case(i, "Case "+i);
				break;
			default :
				c = new Propriete(i, "Propriete "+i);
				break;
			}
			this.cases[i] = c;
		}
	}
	
	public void lierCases(){
		for(int i=0 ; i<cases.length-1 ; i++){
			cases[i].setNext(cases[i+1]);
		}
		cases[cases.length-1].setNext(cases[0]);
	}
	
	/***** GETTERS SETTERS *****/
	
	public Case[] getCases() {
		return cases;
	}
	
	public Case getCaseDepart(){
		return cases[0];
	}
	
}
