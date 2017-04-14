package drink;

import drink.Drinkable;

public abstract class Coffee extends Drinkable {
	//protected int totalAmount;
	private int shot;
	private int syrup;
	private int water;
	protected int espressoAmount = 1;

	public Coffee(int shot, int syrup, int water){
		this.shot = shot;
		this.syrup = syrup;
		this.water = water;

	}

	public Coffee(){

	}

	public void setShot(int shot){
		this.shot = shot;
	}
	public int getShot(){
		return shot;
	}
	public void setSyrup(int syrup){
		this.syrup = syrup;
	}
	public int getSyrup(){
		return syrup;
	}

	public void setWater(int Water){
		this.water = water;
	}
	public int getWater(){
		return water;
	}
}
