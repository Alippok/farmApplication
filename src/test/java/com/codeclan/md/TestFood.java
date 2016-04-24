package com.codeclan.md;

import org.junit.*;
import static org.junit.Assert.*;

public class TestFood {

	@Test
	public void testFoodChildCanSetType(){
		Food grass = new Grass();
		grass.setType("grass");
		assertEquals("grass", grass.getType());
	}
	
	@Test 
	public void testFoodChildInitializesWithEnergy(){
		Food oat = new Oat();
		assertTrue(34 == oat.getEnergy());
	}
	
	@Test
	public void testGrassInitializesWithCorrectEnergy(){
		Food grass = new Grass();
		assertTrue(12 == grass.getEnergy());
	}
}
