package monopoly;

import java.util.ArrayList;
import java.util.Iterator;
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
				try {
					j.jouer(gobelet);
				} catch (SoldeNegatifException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
			Iterator<Joueur> it = joueurs.iterator();
			while(it.hasNext()){
				Joueur j = it.next();
				try {
					j.jouer(gobelet);
				} catch (SoldeNegatifException e) {
//					e.printStackTrace();
					it.remove();
					j.remettreEnJeu();
					System.out.println(j.getNom()+" a fait FAILLITE !");
				}
				if(joueurs.size()==1){
					System.out.println(joueurs.get(0).getNom()+" REMPORTE LA PARTIE !!!");
					return;
				}
			}
			System.out.println();
		}
	}
	
	
	/***** GETTERS SETTERS *****/
}
