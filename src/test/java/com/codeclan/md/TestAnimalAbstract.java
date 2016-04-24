package com.codeclan.md;

import org.junit.*;
import static org.junit.Assert.*;


public class TestAnimalAbstract {

	@Test
	public void testAnimalChildCanSetType(){
		Animal pig = new Pig();
		pig.setType("pig");
		assertEquals("pig", pig.getType());
	}
	
	@Test 
	public void testOtherAnimalChildCanSetType(){
		Animal cow = new Cow();
		cow.setType("cow");
		assertEquals("cow", cow.getType());
	}
	
	@Test
	public void testAnimalChildCanSetWeight(){
		Animal sheep = new Sheep();
		sheep.setWeight(120);
		assertTrue(120 == sheep.getWeight());
	}
	
	@Test
	public void testPigIncreasesWeightByHalfOfFoodEnerg(){
		Animal pig = new Pig();
		pig.setWeight(150.43);
		Food grass = new Grass();
		pig.eat(grass);
		assertTrue(156.43 == pig.getWeight());
	}
	
	@Test
	public void testCowIncreaseWeightByQuarterOfFoodEnergy(){
		Animal cow = new Cow();
		cow.setWeight(300);
		Food grass = new Grass();
		cow.eat(grass);
		assertTrue(303 == cow.getWeight());
	}
	
	@Test
	public void testSheepIncreasesWeightByHalfOFFoodEnergy(){
		Animal sheep = new Sheep();
		sheep.setWeight(123.34);
		Food oat = new Oat();
		sheep.eat(oat);
		assertTrue(140.34 == sheep.getWeight());
	}
	
	@Test
	public void testSheepIncreasesWeightMultipleTimes(){
		Animal sheep = new Sheep();
		sheep.setWeight(123.34);
		Food oat = new Oat();
		Food grass = new Grass();
		sheep.eat(oat);
		sheep.eat(grass);
		assertTrue(146.34 == sheep.getWeight());
	}
	
	@Test
	public void testPigIsPricedCorrectlyForUnder100Weight(){
		Animal pig = new Pig();
		pig.setWeight(90.45);
		pig.setPrice();
		assertTrue(100 == pig.getPrice());
	}
	
	@Test
	public void testPigIsCorrecltyPricedForBetween40And59Weight(){
		Animal pig = new Pig();
		pig.setWeight(50.56);
		pig.setPrice();
		assertTrue(60 == pig.getPrice());
	}
	
	@Test
	public void testSheepIsPricedCorrectlyForBetween40And60Weight(){
		Animal sheep = new Sheep();
		sheep.setWeight(56.45);
		sheep.setPrice();
		assertTrue(40 == sheep.getPrice());
	}
	
	@Test
	public void testPigPriceIncreasesIfWeightIncreasesAboveAPriceThreshhold(){
		Animal pig = new Pig();
		pig.setWeight(50.56);
		Food oat = new Oat();
		pig.eat(oat);
		pig.setPrice();
		assertTrue(100 == pig.getPrice());
	}
	
	@Test
	public void testCowIsPricedCorrectlyForGivenWeight(){
		Animal cow = new Cow();
		cow.setWeight(350.56);
		cow.setPrice();
		assertTrue(249.99 == cow.getPrice());
	}
	
	@Test
	public void testCowIsPriced0IfWeightIsBelow50(){
		Animal cow = new Cow();
		cow.setWeight(20.84);
		cow.setPrice();
		assertTrue(0 == cow.getPrice());
	}
	
	
	
	
	
	
	
	
	
}
