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


		System.out.println("주문하신 아메리카노가 나왔습니다");
		System.out.println("샷은 "+shot+"잔 추가");
		System.out.println("시럽은 "+syrup+"번 추가");
		System.out.println("물은 "+water+"번 추가\n");
	}

	@Override
	public void reduceAmount(int amount) {
		totalAmount -= amount;
	}	
}
