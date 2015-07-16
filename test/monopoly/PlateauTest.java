package monopoly;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;

public class PlateauTest {

	@Test
	public void testPlateau() {
		Plateau p = new Plateau();
		for(int i=0 ; i<40 ; i++){
//			try {
//				Field field = p.getClass().getDeclaredField("cases");
//				field.setAccessible(true);
//				Case[] cases = (Case[]) field.get(p);
//				if(cases[i].getNumero() != i+1){
//					fail("Numero de la case "+cases[0].getNumero()+", valeur de i : "+i+1);
//				}
//			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
//				fail("EXCEPTION : "+e.toString());
//			}
			assertEquals(i+1, p.getCases()[i].getNumero());
		}
	}
}
