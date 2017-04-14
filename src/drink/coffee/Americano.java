package drink.coffee;

import drink.Coffee;

public class Americano extends Coffee{
	public Americano(){
		totalAmount = espressoAmount + 4;
	}

	@Override
	public void reduceAmount(int amount) {
		totalAmount -= amount;
	}	
}
