package monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParcGratuitTest {

	@Test
	public void testArreter() {
		Joueur joueur = new Joueur();
		int soldeInitJoueur = 2000;
		joueur.setSolde(soldeInitJoueur);
		ParcGratuit pg = new ParcGratuit();
		int soldeInitPG = 1000;
		pg.setGagnote(soldeInitPG);
		pg.arreter(joueur);
		assertEquals(soldeInitJoueur+soldeInitPG, joueur.getSolde());
		assertEquals(0, pg.getGagnote());
	}
}
