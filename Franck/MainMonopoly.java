package monopoly;

import javax.swing.JOptionPane;

public class MainMonopoly {


	public static void main(String[] args) {
		Monopoly monopoly = new Monopoly();
		
		Joueur joueur1 = new Joueur("Fernand");
//		Pion pion1 = new Pion(TypePion.BATEAU);
		
		Joueur joueur2 = new Joueur("Léonard");
//		Pion pion2 = new Pion(TypePion.CHIEN);
		
		Joueur joueur3 = new Joueur("Lisbeth");
		
//		String reponse = JOptionPane.showInputDialog("Entrez le nombre de tours");
//		int nb = Integer.parseInt(reponse);
//		System.out.println(">>> Nombre de tours : " + nb);
		
		monopoly.add(joueur1);
		monopoly.add(joueur2);
		monopoly.add(joueur3);
		
		monopoly.lancerPartie();

	}

}
