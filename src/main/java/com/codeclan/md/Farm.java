package com.codeclan.md;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Farm {

	private ArrayList<Animal> field;
	
	public Farm(){
		field = new ArrayList<Animal>(10);
	}
	
	public List getField(){
//		List<Animal> readOnlyField = Collections.unmodifiableList(field);
		ArrayList<String> animalList = new ArrayList<String>(); 
		for(Animal livestock : field)
		{
			animalList.add(livestock.getType());
		}
		return Collections.unmodifiableList(animalList);
		
	}
	
	public boolean addAnimal(Animal liveStock){
		if (field.add(liveStock)){
			return true;
		} else {
			return false;
		}
		
	}
	
	public Animal findAnimalWithId(int id){
	 
		ArrayList<Animal> result = new ArrayList<Animal>();
		for(Animal livestock : field){
			if(livestock.getId()==id){
				result.add(livestock);
			}
		}
		return result.get(0);
	}
	
	public ArrayList findAnimalsOfType(String type){
		ArrayList<Animal> result = new ArrayList<Animal>();
		for(Animal livestock: field){
			if(livestock.getType()==type){
				result.add(livestock);
			}
		}
		return result;
	}
}
