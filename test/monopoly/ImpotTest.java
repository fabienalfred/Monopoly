package monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImpotTest {

	@Test
	public void testArreter() throws SoldeNegatifException {
		Joueur j = new Joueur();
		int soldeInit = 2000;
		j.setSolde(soldeInit);
		Impot i = new Impot();
		i.arreter(j);
		assertEquals(soldeInit-soldeInit*i.getPCT()/100, j.getSolde());
	}
}
