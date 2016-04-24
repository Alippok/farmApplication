package com.codeclan.md;

public class Sheep extends Animal{
	
	public Sheep(int id){
		super();
		this.type = "sheep";
		this.id = id;
	}

	@Override
	public void eat(Food food) {
		double energyGained = food.getEnergy() / 2;
		this.weight += energyGained;
		
	}

	@Override
	public void setPrice() {
		if(weight<=120.00 && weight>=90.00){
			price = 99.99;
		} 
		else if(weight<=89.99 && weight>=70.00){
			price = 50;
		}
		else if(weight<= 69.99 && weight>=40.00){
			price = 40;
		}
		else if(weight<=39.99 && weight>=10.00){
			price = 20;
		}
		else {
			price = 0;
		}
		
	}

}
