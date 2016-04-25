package com.codeclan.md;

import org.junit.*;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class TestFarm {

	@Test 
	public void testFarmIsCreatedAsEmptyArrayList(){
		Farm farm = new Farm();
		assertEquals(0,farm.getField().size());
	}
	
	@Test (expected=UnsupportedOperationException.class)
	public void testReturnFromGetFieldMethodIsReadOnly() throws UnsupportedOperationException{
		Farm farm = new Farm();
		Animal cow = new Cow(1);
		List<Animal> field = farm.getField();
		try {
			field.add(cow);
		} catch(UnsupportedOperationException e){
			throw new UnsupportedOperationException();
		}
		
		
	}
	
	@Test 
	public void testCanAddAnimalToField(){
		Farm farm = new Farm();
		Animal cow = new Cow(1);
		assertTrue(farm.addAnimal(cow)==true);
	}
	
	@Test
	public void testCanAddMultipleAnimalsToField(){
		Farm farm = new Farm();
		Animal cow = new Cow(1);
		Animal sheep = new Sheep(2);
		farm.addAnimal(cow);
		assertTrue(farm.addAnimal(sheep)==true);
				
	}
	
	@Test
	public void testCanAddMultipleAnimalsOfSameClass(){
		Farm farm = new Farm();
		Animal cow = new Cow(1);
		Animal cowTwo = new Cow(2);
		farm.addAnimal(cow);
		farm.addAnimal(cowTwo);
		assertEquals(2,farm.getField().size());
	}
	
//	@Test
//	public void testCanSeeAllAnimalsInField(){
//		Farm farm = new Farm();
//		Animal cow = new Cow();
//		Animal sheep = new Sheep();
//		farm.addAnimal(cow);
//		farm.addAnimal(sheep);
//		String[] testList = {"cow", "sheep"};	
//		assertEquals(true, testList.equals(farm.getField()));
//	}
	//How to see the innards of the array to compare them? like deepEquals in JavaScript?
	//I am getting the correct object back but want to compare them.
	
	@Test
	public void testCanFindAnimalForGivenId() throws AnimalNotFoundException{
		Farm farm = new Farm();
		Animal cow = new Cow(1);
		Animal sheep = new Sheep(2);
		sheep.setWeight(56.45);
		sheep.setPrice();
		farm.addAnimal(cow);
		farm.addAnimal(sheep);
		Animal foundAnimal = farm.findAnimalWithId(2); 
		assertEquals("Details{Type: sheep, Id: 2, Weight: 56.45, Price: 40.0", foundAnimal.getDetails());
		
	}
	
	@Test
	public void testFindAnimalDoesNotRemoveAnimalFromFarm() throws AnimalNotFoundException{
		Farm farm = new Farm();
		Animal cow = new Cow(1);
		Animal sheep = new Sheep(2);
		sheep.setWeight(56.45);
		sheep.setPrice();
		farm.addAnimal(cow);
		farm.addAnimal(sheep);
		Animal foundAnimal = farm.findAnimalWithId(2); 
		assertTrue(2==farm.getField().size());
	}
	
	@Test (expected = AnimalNotFoundException.class)
	public void testThrowsExceptionIfAnimalIdIsNotFound() throws AnimalNotFoundException{
		Farm farm = new Farm();
		Animal cow = new Cow(1);
		Animal sheep = new Sheep(2);
		sheep.setWeight(56.45);
		sheep.setPrice();
		farm.addAnimal(cow);
		farm.addAnimal(sheep);
		
		try {
			farm.findAnimalWithId(3);
			fail("Exception was not thrown");
		} catch(AnimalNotFoundException e) {
			System.err.println(e.getMessage());
			throw new AnimalNotFoundException();		
		}
	}
	
	@Test
	public void testCanFindAnimalsForGivenType(){
		Farm farm = new Farm();
		Animal cow = new Cow(1);
		Animal sheep = new Sheep(2);
		Animal cowTwo = new Cow(3);
		cow.setWeight(350.56);
		cow.setPrice();
		sheep.setWeight(56.45);
		sheep.setPrice();
		cowTwo.setWeight(348.00);
		cowTwo.setPrice();
		farm.addAnimal(cow);
		farm.addAnimal(sheep);
		farm.addAnimal(cowTwo);
		ArrayList<Animal> foundAnimals = farm.findAnimalsOfType("cow");
		assertTrue(2 == foundAnimals.size());
		
	}
	
	@Test
	public void testCanFindAnimalsForDifferentGivenType(){
		Farm farm = new Farm();
		Animal cow = new Cow(1);
		Animal sheep = new Sheep(2);
		Animal cowTwo = new Cow(3);
		cow.setWeight(350.56);
		cow.setPrice();
		sheep.setWeight(56.45);
		sheep.setPrice();
		cowTwo.setWeight(348.00);
		cowTwo.setPrice();
		farm.addAnimal(cow);
		farm.addAnimal(sheep);
		farm.addAnimal(cowTwo);
		ArrayList<Animal> foundAnimals = farm.findAnimalsOfType("sheep");
		assertTrue(1 == foundAnimals.size());
		
	}
	
//	@Test
//	public void testCanRemoveAnimalFromFarmForGivenId() throws AnimalNotFoundException{
//		Farm farm = new Farm();
//		Animal cow = new Cow(1);
//		Animal sheep = new Sheep(2);
//		Animal cowTwo = new Cow(3);
//		cow.setWeight(350.56);
//		cow.setPrice();
//		sheep.setWeight(56.45);
//		sheep.setPrice();
//		cowTwo.setWeight(348.00);
//		cowTwo.setPrice();
//		farm.addAnimal(cow);
//		farm.addAnimal(sheep);
//		farm.addAnimal(cowTwo);
//		farm.removeAnimalWithId(1);
//		assertTrue(2 == farm.getField().size());
//	}
//	
//	@Test (expected = AnimalNotFoundException.class)
//	public void testExceptionISThrownIfAnimalIdDoesNotExist() throws AnimalNotFoundException{
//		Farm farm = new Farm();
//		Animal cow = new Cow(1);
//		Animal sheep = new Sheep(2);
//		Animal cowTwo = new Cow(3);
//		cow.setWeight(350.56);
//		cow.setPrice();
//		sheep.setWeight(56.45);
//		sheep.setPrice();
//		cowTwo.setWeight(348.00);
//		cowTwo.setPrice();
//		farm.addAnimal(cow);
//		farm.addAnimal(sheep);
//		farm.addAnimal(cowTwo);
//		
//		try {
//			farm.removeAnimalWithId(4);
//			fail("Exception was not thrown");
//		} catch(AnimalNotFoundException e) {
//			System.err.println(e.getMessage());
//			throw new AnimalNotFoundException();
//			
//		}
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
