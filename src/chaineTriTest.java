import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class chaineTriTest {

	chaineTri phrase;
	@Before
	public void setUp() throws Exception {
		phrase =new chaineTri();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void chaineVide() {
		phrase.ajouterLettre("");
		assertEquals("", phrase.getMachaine());
	}
	
	@Test
	public void queDesLettresa() {
		phrase.ajouterLettre("aAA");
		assertEquals("aaa", phrase.getMachaine());
	}
	
	@Test
	public void avecDesaEtSansCaracSpec() {
		phrase.ajouterLettre("...aAA!!!!!?\"");
		assertEquals("aaa", phrase.getMachaine());
	}
	
	@Test
	public void acceptation() {
		fail("Not yet implemented");
	}

}
