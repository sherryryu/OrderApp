package person;

import drink.DrinkThread;
import drink.IDrinkable;
import drink.Drinkable;

public class Person {
	
	private int drinkingSpeed = 1;
	private Drinkable d;
	public void setDrinkingSpeed(int speed) {
		this.drinkingSpeed = speed;
	}
	public int getDrinkingSpeed(){
		return this.drinkingSpeed;
	}
	
	
	public void drink(Drinkable d){
		this.d= d;
	Thread thread = new DrinkThread(d,drinkingSpeed);
		thread.start();

//		while(d.getTotalAmount() > 0 ){
//			System.out.println("꿀꺽");
//			d.reduceAmount(drinkingSpeed);
//		}
	}
}
