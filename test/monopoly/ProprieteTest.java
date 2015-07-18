package monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProprieteTest {

	@Test
	public void testArreter() {
		Joueur j1 = new Joueur();
		Joueur j2 = new Joueur();
		int soldeInit = 2000;
		j1.setSolde(soldeInit);
		j2.setSolde(soldeInit);
		Propriete p1 = new Propriete(0, "Propriete1");
		Propriete p2 = new Propriete(1, "Propriete2");
		int prix = 1000;
		int loyer = 100;
		p1.setPrixAchat(prix);
		p1.setLoyer(loyer);
		p2.setPrixAchat(prix);
		p2.setLoyer(loyer);
		
		// Test j2 paye loyer a j1
		p1.setOwner(j1);
		p1.arreter(j2);
		assertEquals(j2.getSolde(), soldeInit-p1.getLoyer());
		assertEquals(p1.getOwner().getSolde(), soldeInit+p1.getLoyer());
		
		// Test j2 ne peut pas payer loyer => remet ses proprietes en jeu
		j2.addPropriete(p2);
		j2.setSolde(0);
		p1.arreter(j2);
		assertTrue(j2.getProprietes().isEmpty());
	}
}
