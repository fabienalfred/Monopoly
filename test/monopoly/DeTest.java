package monopoly;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class DeTest {
	private static int MAX =100_000;
	private static int[] lances = new int[6];	//nombres d'occurences
	
	@Test
	public void testGetValue() {
		De de = new De();
		assertEquals(de.lancer(), de.getValue());
	}

	@Test
	public void testLancer() {
		De de = new De();
		for(int i=0 ; i<MAX ; i++){
			int val = de.lancer();
			if(val<1 || val>6)
				fail("Valeur de lancer : "+val);
			lances[val-1]++;
		}
	}
	
	@AfterClass
	public static void afficherResultats(){
		for(int i=0 ; i<lances.length ; i++){
			System.out.println("Nb de "+(i+1)+" : "+lances[i]);
		}
	}

}
