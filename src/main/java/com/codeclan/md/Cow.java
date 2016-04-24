package com.codeclan.md;

public class Cow extends Animal{

	@Override
	public void eat(Food food) {
		double energyGained = food.getEnergy() / 4;
		this.weight += energyGained;
	}

	@Override
	public void setPrice() {
		if(weight<=400.00 && weight>=300.00){
			price = 249.99;
		} 
		else if(weight<=299.99 && weight>=200.00){
			price = 179.99;
		}
		else if(weight<= 199.99 && weight>=80.00){
			price = 99.99;
		}
		else if(weight<=79.99 && weight>=50.00){
			price = 20;
		}
		else {
			price = 0;
		}
		
	}

}
