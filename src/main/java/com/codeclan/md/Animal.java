package com.codeclan.md;

public abstract class Animal {

	protected String type;
	protected double weight;
	protected double price;
	protected int id;
	
	public Animal(){
		
	}
	
	public int getId(){
		return id;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public double getWeight(){
		return weight;
	}
	
	abstract public void eat(Food food);
	
	abstract public void setPrice();
	
	public double getPrice(){
		return price;
	}
	
	public String getDetails(){
		return "Details{Type: "+type+", Id: "+id+", Weight: "+weight+", Price: "+price;
	}
}
