package monopoly;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DeTest.class, GobeletTest.class, PlateauTest.class,
				JoueurTest.class, ProprieteTest.class, CaseDepartTest.class,
				TaxeDeLuxeTest.class, ImpotTest.class, AllezEnPrisonTest.class,
				BanqueTest.class, ParcGratuitTest.class, PionTest.class})
public class AllTests {

}
