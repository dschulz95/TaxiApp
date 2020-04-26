package de.clausthal.taxi;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import de.clausthal.taxi.TaxiAuto;

public class TaxiAutoTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Datenbankverbindung aufbauen"); 
	}
	@Test
	public void testSetSpeed() {
		TaxiAuto taxi = new TaxiAuto();
		try {
			taxi.setSpeed(-5);
			fail("Negative Geschwindigkeit nicht möglich");
		}
		catch(IllegalArgumentException e) {}
		assertEquals(0, taxi.getSpeed());
		taxi.setSpeed(0); 
		assertEquals(0, taxi.getSpeed());
		
	}
	@Test
	public void testBeschleunigen() {
		TaxiAuto taxi = new TaxiAuto();
		assertEquals(0, taxi.getSpeed());
		taxi.beschleunigen();
		assertTrue(taxi.getSpeed() > 0); 
		System.out.println("beschleunigen Methode erfolgreich getestet"); 
	}
	@Test
	public void testBremsen() {
		TaxiAuto taxi = new TaxiAuto();
		assertEquals(0, taxi.getSpeed());
		taxi.bremsen();
		assertEquals("Geschwindigkeit nicht null", 0, taxi.getSpeed());
		taxi.beschleunigen();
		taxi.beschleunigen();
		taxi.bremsen();
		assertTrue(taxi.getSpeed() > 0);
		System.out.println("bremsen Methode erfolgreich getestet"); 
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Datenbankverbindung wieder abbauen"); 
	}

}
