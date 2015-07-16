package monopoly;

import java.util.Random;

public class De {
	private int value;
	private Random random = new Random();

	public int getValue() {
		return value;
	}

	public int lancer(){
		value = random.nextInt(6)+1;
//		value = (int) ((Math.random()*6) + 1);
		return value;
	}
}
