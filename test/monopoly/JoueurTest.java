package monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class JoueurTest {

	@Test
	public void testCrediter() {
		Joueur j = new Joueur();
		int ancienSolde = j.getSolde();
		int somme = 100;
		j.crediter(somme);
		assertEquals(j.getSolde(), ancienSolde+somme);
	}

	@Test
	public void testDebiter() {
		Joueur j = new Joueur();
		j.setSolde(2000);
		int ancienSolde = j.getSolde();
		int somme = 100;
		j.debiter(somme);
		assertEquals(j.getSolde(), ancienSolde-somme);
	}
	
	@Test
	public void testAddPropriete(){
		Joueur j = new Joueur();
		Propriete propriete = new Propriete(0, "Propriete");
		j.addPropriete(propriete);
		assertTrue(j.getProprietes().contains(propriete));
	}
	
	@Test
	public void testRemettreEnJeu(){
		Joueur j = new Joueur();
		if(Math.random()>0.5)
			j.addPropriete(new Propriete(0, "Propriete"));
		j.remettreEnJeu();
		assertTrue(j.getProprietes().isEmpty());
	}
	
}
