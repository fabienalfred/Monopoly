package monopoly;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Monopoly {
	private Plateau plateau = new Plateau();
	private Gobelet gobelet = new Gobelet();
	private List<Joueur> joueurs = new ArrayList<>();
	private Stack<Pion> pions = new Stack<>();
	private static final int NB_TOURS = 50;

	{
		for(TypePion type : TypePion.values()){
			pions.push(new Pion(type));
		}
	}
	
	@Deprecated
	public void add(Joueur joueur, Pion pion) {
		pion.setPosition(plateau.getCaseDepart());
		joueur.setPion(pion);
		pion.setJoueur(joueur);
		joueurs.add(joueur);
	}
	
	public void add(Joueur joueur) {
		Pion pion = pions.pop();
		pion.setPosition(plateau.getCaseDepart());
		joueur.setPion(pion);
		pion.setJoueur(joueur);
		joueurs.add(joueur);
		System.out.println("<<< Le joueur "+joueur.getName()+" a choisi le pion "+pion.getName()+" >>>");
	}

	public void lancerPartie() {
		System.out.println("\n====== LANCEMENT DE LA PARTIE ======\n");
		for (int i = 0; i < NB_TOURS; i++) {
			System.out.println("=> TOUR N° "+(i+1));
			Iterator<Joueur> it = joueurs.iterator();
			while(it.hasNext()){
				Joueur joueur = it.next();
				
				try {
					joueur.jouer(gobelet);
				} catch (SoldeNegatifException e) {
					joueur.remettreEnJeuxLesProprietes();
					it.remove();
					System.out.println("!!! "+joueur.getName()+" quitte le jeu");
				}
				if(joueurs.size()==1){
					System.out.println("TIN TIN !!!! "+joueurs.get(0).getName()+" a gagné");
					return;
				}
			}
//			for (Joueur joueur : joueurs) {
//				try {
//					joueur.jouer(gobelet);
//				} catch (SoldeNegatifException e) {
//					
//				}
//			}
		}
	}
	
//	public void lancerPartie(int nbTours) {
//		System.out.println("\n====== LANCEMENT DE LA PARTIE ======\n");
//		for (int i = 0; i < nbTours; i++) {
//			System.out.println("=> TOUR N° "+(i+1));
//			for (Joueur joueur : joueurs) {
//				joueur.jouer(gobelet);
//			}
//		}
//	}

}
