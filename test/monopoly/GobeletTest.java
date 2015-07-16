package monopoly;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.BeforeClass;
import org.junit.Test;

public class GobeletTest {
	private static int MAX =10_000_000;

	@Test
	public void testLancer() {
		Gobelet gobelet = new Gobelet();
		for(int i=0 ; i<MAX ; i++){
			int val = gobelet.lancer();
			if(val<2 || val>12)
				fail("Valeur de lancer : "+val);
		}
	}

	@Test
	public void testIsDouble() {
		int cpt = 0;
		Gobelet gobelet = new Gobelet();
		for(int i=0 ; i<MAX ; i++){
			gobelet.lancer();
			boolean isDouble = gobelet.isDouble();
			if(isDouble){
				cpt++;
				try {
					Field field = gobelet.getClass().getDeclaredField("des");
					field.setAccessible(true);
					De[] des = (De[]) field.get(gobelet);
					if(des[0].getValue()!=des[1].getValue()){
						fail("Double  avec valeurs "+des[0].getValue()+" et "+des[1].getValue());
					}
				} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
					fail("EXCEPTION : "+e.toString());
				}
			}
		}
		if(cpt==0)
			fail("Aucun double");
	}
}
