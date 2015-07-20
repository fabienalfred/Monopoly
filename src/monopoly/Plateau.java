package monopoly;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Plateau {

	/***** ATTRIBUTES *****/
	
	final private Case[] cases = new Case[40];
	
	
	/***** CONSTRUCTORS *****/

	public Plateau() {
		for(int i=0 ; i<cases.length ; i++){
			try {
				initialiserCases("monopoly.csv");
			} catch (Exception e) {
				e.printStackTrace();
				initialiserCases();
			} 
			lierCases();
		}
	}
	
	
	/***** METHODS 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException *****/
	
	public void initialiserCases(String filename) throws IOException,
														InstantiationException,
														IllegalAccessException,
														ClassNotFoundException{
		String filein = filename;
		String s = null;
		try (FileReader filereader = new FileReader(filein);
				BufferedReader in = new BufferedReader(filereader)){
			in.readLine();
			Case c = null;
			while((s = in.readLine()) != null){
				String[] champs = s.split(",");
				c = (Case) Class.forName("monopoly."+champs[2]).newInstance();
				c.setNom(champs[3]);
				if(c instanceof Propriete){
					((Propriete) c).setPrixAchat(Integer.parseInt(champs[5]));
					((Propriete) c).setLoyer(Integer.parseInt(champs[6]));
				}
				cases[Integer.parseInt(champs[1])] = c;
			}
			((AllezEnPrison) this.cases[30]).setPrison(this.cases[10]);
		}
	}
	
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
			case 2:case 7:case 10:case 17:case 20:case 22:case 33:case 36:
				c = new Case("Case "+i);
				break;
			default :
				c = new Propriete("Propriete "+i);
				((Propriete) c).setPrixAchat(200*i);
				((Propriete) c).setLoyer(20*i);
				break;
			}
			this.cases[i] = c;
		}
		((AllezEnPrison) this.cases[30]).setPrison(this.cases[10]);
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
