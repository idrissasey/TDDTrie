import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoterieTest {
	
	Loterie loterie ;
	@Before
	public void setUp() throws Exception {
		 loterie = new Loterie();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLoterie() {
		assertEquals(60, loterie.getNbBoule());
	}
	
	@Test
	public void aucuneBouleTirée() {
		loterie.tirerBoule("");
		assertEquals("", loterie.getBouleTirer());
	}
	
	@Test
	public void uneBouleTirée() {
		loterie.tirerBoule("10");
		assertEquals("10", loterie.getBouleTirer());
	}
	
	@Test
	public void deuxBouleTirée() {
		loterie.tirerBoule("10");
		loterie.tirerBoule("20");
		assertEquals("10 20", loterie.getBouleTirer());
	}
	
	@Test
	public void troisBouleTirée() {
		loterie.tirerBoule("10");
		loterie.tirerBoule("20");
		loterie.tirerBoule("30");
		//tirer = tirer + " "+ loterie.tirerBoule(20);
		assertEquals("10 20 30", loterie.getBouleTirer());
	}
	
	@Test
	public void acceptation() {
		loterie.tirerBoule("0");
		loterie.tirerBoule("30");
		loterie.tirerBoule("20");
		loterie.tirerBoule("40");
		loterie.tirerBoule("5");
		loterie.tirerBoule("3");
	
		//tirer = tirer + " "+ loterie.tirerBoule(20);
		assertEquals("0 3 5 20 30 40", loterie.getBouleTirer());
	}


}
