package person;

import drink.IDrinkable;

public class Person {
	
	private int drinkingSpeed = 1;
	
	public void setDrinkingSpeed(int speed) {
		this.drinkingSpeed = speed;
	}
	public int getDrinkingSpeed(){
		return this.drinkingSpeed;
	}
	
	
	public void drink(IDrinkable d){
		
		while(d.getAmount() > 0 ){
			System.out.println("꿀꺽");
			d.reduceAmount(drinkingSpeed);
		}
	}
}
