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
		Propriete p = new Propriete("Propriete");
		int prix = 1000;
		int loyer = 100;
		p.setPrixAchat(prix);
		p.setLoyer(loyer);
		
		// Test j2 paye loyer a j1
		p.setOwner(j1);
		try {
			p.arreter(j2);
			assertEquals(j2.getSolde(), soldeInit-p.getLoyer());
			assertEquals(p.getOwner().getSolde(), soldeInit+p.getLoyer());
		} catch (SoldeNegatifException e) {
			System.out.println("Solde negatif");
			e.printStackTrace();
		}
		
	}
}
