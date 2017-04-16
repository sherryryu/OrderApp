package drink.coffee;

import drink.Coffee;

public class Americano extends Coffee {
	public Americano(){
		int OriRecipeWater = 4;
		totalAmount = espressoAmount + OriRecipeWater;
	}
	public Americano (int shot, int syrup, int water){
		super(shot, syrup, water);
		int OriRecipeWater = 4;
		totalAmount = espressoAmount + OriRecipeWater + water;

	infoOrder("아메리카노");
	}

//	@Override
//	public void reduceAmount(int amount) {
//		totalAmount -= amount;
//	}	
}
