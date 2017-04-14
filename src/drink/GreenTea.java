package drink;

public class GreenTea implements IDrinkable{
	private int totalAmount = 5;

	@Override
	public void reduceAmount(int amount) {
		this.totalAmount -= amount;
	}

	@Override
	public int getAmount() {
		// TODO Auto-generated method stub
		return this.totalAmount;
	}
	
}
