package com.codeclan.md;

public class AnimalNotFoundException extends Exception {

	public AnimalNotFoundException(){
		super("This animal could not be found");
	}
}
