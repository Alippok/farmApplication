package com.codeclan.md;

public class Pig extends Animal{

	@Override
	public void eat(Food food) {
		double energyGained = food.getEnergy() / 2;
		weight += energyGained;
		
	}

	@Override
	public void setPrice() {
		if(weight<=150.00 && weight>=100.00){
			price = 120;
		} 
		else if(weight<=99.99 && weight>=60.00){
			price = 100;
		}
		else if(weight<= 59.99 && weight>=40.00){
			price = 60;
		}
		else if(weight<=39.99 && weight>=10.00){
			price = 20;
		}
		else {
			price = 0;
		}
		
	}

	

}
