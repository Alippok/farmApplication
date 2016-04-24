package com.codeclan.md;

public abstract class Food {

	protected String type;
	protected double energy;
	
	public Food(){
		
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public double getEnergy(){
		return energy;
	}
}
