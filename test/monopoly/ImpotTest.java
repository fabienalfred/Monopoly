package monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImpotTest {

	@Test
	public void testArreter() {
		Joueur j = new Joueur();
		int soldeInit = 2000;
		j.setSolde(soldeInit);
		Plateau plateau = new Plateau();
		((ParcGratuit)plateau.getCases()[20]).setCagnotte(0);
		try {
			plateau.getCases()[4].arreter(j);
			System.out.println("Le joueur paie : "+(soldeInit-j.getSolde())+", cagnotte : "+((ParcGratuit)plateau.getCases()[20]).getCagnotte());
			assertEquals(((ParcGratuit)plateau.getCases()[20]).getCagnotte(), soldeInit-j.getSolde());
		} catch (SoldeNegatifException e) {
			System.out.println("Solde negatif");
			e.printStackTrace();
		}
	}
}
