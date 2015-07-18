package monopoly;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Monopoly {

	/***** ATTRIBUTES *****/

	private Plateau plateau;
	private List<Joueur> joueurs = new ArrayList<Joueur>();
	private Gobelet gobelet;
	private Stack<Pion> pions = new Stack<>();
	private static final int NB_TOURS = 10;
	
	{
		for(TypePion type : TypePion.values()){
			pions.push(new Pion(type));
		}
	}
	
	/***** CONSTRUCTORS *****/

	public Monopoly(){
		this.plateau = new Plateau();
		this.gobelet = new Gobelet();
	}
	
	
	/***** METHODS *****/

	public void addJoueur(Joueur j){
		Pion p = pions.pop();
		p.setPosition(plateau.getCaseDepart());
		j.setPion(p);
		p.setJoueur(j);
		this.joueurs.add(j);
		j.setPlateau(this.plateau);
		System.out.println("<<< Le joueur "+j.getNom()+" a choisi le pion "+p.getName()+" >>>");
	}
	
	@Deprecated
	public void lancerPartie(){
		for(Joueur j : joueurs){
			j.getPion().setPosition(plateau.getCaseDepart());
		}
		for(int i=0 ; i<NB_TOURS ; i++){
			System.out.println("TOUR "+(i+1));
			for(Joueur j : joueurs){
				j.jouer(gobelet);
			}
			System.out.println();
		}
	}
	
	public void lancerPartie(int nbTours){
		for(Joueur j : joueurs){
			j.getPion().setPosition(plateau.getCaseDepart());
		}
		System.out.println();
		for(int i=0 ; i<nbTours ; i++){
			System.out.println("TOUR "+(i+1));
			for(Joueur j : joueurs){
				j.jouer(gobelet);
			}
			System.out.println();
		}
	}
	
	
	/***** GETTERS SETTERS *****/
}
