package monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaseDepartTest {

	@Test
	public void testPasser() {
		Joueur j = new Joueur();
		int soldeInit = 2000;
		j.setSolde(soldeInit);
		Depart c = new Depart();
		c.passer(j);
		assertEquals(j.getSolde(), soldeInit+c.getBonus());
	}
	
	@Test
	public void testAretter(){
		Joueur j = new Joueur();
		int soldeInit = 2000;
		j.setSolde(soldeInit);
		Depart c = new Depart();
		c.arreter(j);
		assertEquals(j.getSolde(), soldeInit+c.getBonus()*2);
	}
}
