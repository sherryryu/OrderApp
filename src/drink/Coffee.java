package drink;

public abstract class Coffee implements IDrinkable{
	protected int totalAmount;
	protected int espressoAmount = 1;
	
	public int drinkableAmount () {
		return totalAmount;
	}
	

	@Override
	public int getAmount() {
		// TODO Auto-generated method stub
		return totalAmount;
	}
}
