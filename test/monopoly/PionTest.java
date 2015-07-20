package monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class PionTest {

	@Test
	public void testGoToPrison() {
		Pion pion = new Pion(TypePion.BATEAU);
		Plateau plateau = new Plateau();
		pion.setPosition(plateau.getCaseDepart());
		pion.goToPrison();
		assertEquals(plateau.getCases()[10], pion.getPosition());
	}
}
