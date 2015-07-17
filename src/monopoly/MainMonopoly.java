package monopoly;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class MainMonopoly {

	public static void main(String[] args) {

		List<Joueur> joueurs = new ArrayList<>();
		int nbJoueurs = Integer.parseInt(JOptionPane.showInputDialog(null,"Combien de joueurs ?",""));
		for(int i =0 ; i<nbJoueurs ; i++){
			String nomJoueur = JOptionPane.showInputDialog(null,"Nom du joueur "+(i+1),"");
			Joueur j = new Joueur(nomJoueur);
			joueurs.add(j);
			
		}
		
		int nbTours = Integer.parseInt(JOptionPane.showInputDialog(null,"Combien de tours ?",""));

		Monopoly monopoly = new Monopoly();
		for(Joueur j : joueurs){
			monopoly.addJoueur(j);
		}
		monopoly.lancerPartie(nbTours);

	}

}
