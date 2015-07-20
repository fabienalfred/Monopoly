package monopoly;

public class Plateau {
	private Case[] cases = new Case[40];
	
	public Plateau() {
		construireLesCases();
		lierLesCases();
	}

	private void construireLesCases() {
		for(int i=0; i<cases.length ; i++){
			Case c = null;
			switch(i){
			case 0:
				c = new Depart("DEPART");
				break;
			case 4:
				c = new Impot();
				break;
			case 38:
				c = new TaxeLuxe();
				break;
			case 1: case 3: case 6: case 8: case 9:
			case 11: case 13: case 14: case 16: case 18: case 19:
			case 21: case 23: case 24: case 26: case 27: case 29:
			case 31: case 32: case 34: case 37: case 39:
				c = new Propriete("Propriete "+i);
				break;
			default:
				c = new Case("CASE "+i);
				break;
			}
			cases[i] = c;
		}	
	}

	private void lierLesCases() {
		for(int i=0; i<cases.length-1 ; i++){
			cases[i].setNext(cases[i+1]);
		}
		cases[cases.length-1].setNext(cases[0]);
	}
	
	public Case getCaseDepart(){
		return cases[0];
	}
}
