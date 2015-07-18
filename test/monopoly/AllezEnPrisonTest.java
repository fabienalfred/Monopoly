package monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class AllezEnPrisonTest {

	@Test
	public void testArreter() {
		Joueur j =new Joueur();
		Pion pion = new Pion(null);
		j.setPion(pion);
		pion.setJoueur(j);
		Plateau plateau = new Plateau();
		j.setPlateau(plateau);
		plateau.getCases()[30].arreter(j);
		assertEquals(j.getPion().getPosition(), j.getPlateau().getCases()[10]);
	}
}
