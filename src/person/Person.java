package person;

import drink.IDrinkable;
import drink.Drinkable;

public class Person {
	
	private int drinkingSpeed = 1;
	
	public void setDrinkingSpeed(int speed) {
		this.drinkingSpeed = speed;
	}
	public int getDrinkingSpeed(){
		return this.drinkingSpeed;
	}
	
	
	public void drink(Drinkable d){
		
		while(d.getTotalAmount() > 0 ){
			System.out.println("꿀꺽");
			d.reduceAmount(drinkingSpeed);
		}
	}
}
