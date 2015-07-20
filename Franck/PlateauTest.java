package monopoly;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlateauTest {

	@Test
	public void testCases(){
		Plateau plateau = new Plateau();
		Case depart = plateau.getCaseDepart();
		Case caseCourante = depart;
		for(int i=0 ; i<40 ; i++){
			caseCourante = caseCourante.getNext();
		}
		assertSame("depart : "+depart.getName()+" - caseCourante : "+caseCourante.getName(),depart, caseCourante);
	}
}
