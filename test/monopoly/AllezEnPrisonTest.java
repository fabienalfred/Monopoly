package monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class AllezEnPrisonTest {

	@Test
	public void testArreter() throws SoldeNegatifException {
		Joueur j =new Joueur();
		Pion pion = new Pion(null);
		j.setPion(pion);
		pion.setJoueur(j);
		Plateau plateau = new Plateau();
		pion.setPosition(plateau.getCases()[30]);
		plateau.getCases()[30].arreter(j);
		assertEquals(plateau.getCases()[10], pion.getPosition());
	}
}
