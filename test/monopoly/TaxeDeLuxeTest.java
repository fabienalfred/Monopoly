package monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaxeDeLuxeTest {

	@Test
	public void testArreter() throws SoldeNegatifException {
		Joueur j = new Joueur();
		int soldeInit = 2000;
		j.setSolde(soldeInit);
		TaxeDeLuxe txlx = new TaxeDeLuxe();
		txlx.arreter(j);
		assertEquals(j.getSolde(), soldeInit-txlx.getMalus());
	}
}
