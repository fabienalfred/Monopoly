package monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class BanqueTest {

	@Test
	public void testCrediter() {
		Banque banque = new Banque();
		int soldeInit = 10000;
		int somme = 5000;
		banque.setSolde(soldeInit);
		banque.crediter(somme);
		assertEquals(soldeInit+somme, banque.getSolde());
	}

	@Test
	public void testDebiter() {
		Banque banque = new Banque();
		int soldeInit = 10000;
		int somme = 5000;
		banque.setSolde(soldeInit);
		banque.debiter(somme);
		assertEquals(soldeInit-somme, banque.getSolde());
	}

	/***** ATTRIBUTES *****/

	/***** CONSTRUCTORS *****/

	/***** METHODS *****/

	/***** GETTERS SETTERS *****/
}
