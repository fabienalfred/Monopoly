package monopoly;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;

public class PlateauTest {

	@Test
	public void testCases(){
		Plateau p = new Plateau();
		Case caseDepart = p.getCaseDepart();
		Case caseCourante = caseDepart;
		for(int i=0 ; i<40 ; i++){
			caseCourante = caseCourante.getNext();
		}
		assertSame(caseDepart, caseCourante);
	}
	
//	@Test
//	public void testInitialiserCases() {
//		Plateau p = new Plateau();
//		for(int i=0 ; i<p.getCases().length ; i++){
//			assertEquals(i, p.getCases()[i].getNumero());
//		}
//	}
	
	@Test
	public void testLierCases(){
		Plateau p = new Plateau();
		for(int i=0 ; i<p.getCases().length-1 ; i++){
			assertEquals(p.getCases()[i].getNext(), p.getCases()[i+1]);
		}
		assertSame(p.getCases()[p.getCases().length-1].getNext(), p.getCases()[0]);
		
	}
}
