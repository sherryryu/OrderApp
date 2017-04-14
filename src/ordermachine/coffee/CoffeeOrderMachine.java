package ordermachine.coffee;

import drink.Coffee;
import ordermachine.OrderMachine;

public class CoffeeOrderMachine extends OrderMachine<Coffee>{
	
	private Coffee ordered;

	@Override
	public void order(Coffee order) { // order(CoffeeBill bill)
									  // bill 에 맞게 커피를 만들어준다 
		
		this.ordered = order;
	}

	@Override
	public Coffee output() {
		// TODO Auto-generated method stub
		return ordered;
	}
	

}
