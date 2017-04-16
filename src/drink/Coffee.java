package drink;

import drink.Drinkable;

public abstract class Coffee extends Drinkable {
	//protected int totalAmount;
	private int shot;
	private int syrup;
	private int water;
	protected int espressoAmount = 1;
	private String menu;
	public Coffee(int shot, int syrup, int water){
		this.shot = shot;
		this.syrup = syrup;
		this.water = water;

	}

	public Coffee(){

	}

	public void infoOrder(String menu){
		getShot();
		getSyrup();
		getWater();
		this.menu = menu;
		System.out.println("주문하신 "+ menu + "나왔습니다");
		System.out.println("샷: "+getShot());
		System.out.println("시럽: "+getSyrup());
		System.out.println("믈: "+getWater());

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
