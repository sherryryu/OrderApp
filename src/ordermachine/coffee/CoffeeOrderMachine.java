package ordermachine.coffee;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import drink.Coffee;
import drink.coffee.Americano;
import drink.coffee.CafeMocha;
import drink.coffee.CaramelMacchiatto;
import ordermachine.OrderMachine;

public class CoffeeOrderMachine extends OrderMachine<Coffee>{
	private String coffeType;
	private int shot;
	private int syrup;
	private int water;
	private Coffee ordered;
	@Override
	public Coffee output() {

		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		Callable<Coffee> CoffeeTask = new Callable<Coffee>() {

			@Override
			public Coffee call() throws Exception {

				if (coffeType.equals("Americano")) {
					if ((syrup > 0) && (shot > 0) && (water > 0)) { //syrup과 shot과 water 값이 모두 0이 아닐 때 = 값이 다 존재할 때
						ordered = new Americano(shot, syrup, water);//아메리카노 객체 생성
					} else {
						ordered = new Americano();
					}
				} else if (coffeType.equals("CaramelMacchiatto")) {
					ordered = new CaramelMacchiatto();
				} else if (coffeType.equals("CafeMocha")) {
					ordered = new CafeMocha();
				}

				return ordered;
			}

		};
		Future<Coffee> future = executorService.submit(CoffeeTask);

		try{
			future.get();
			System.out.println("추출완료");
		}catch(Exception e){
			System.out.print("예외 발생");
		}
		return ordered;
	}

	public void setCoffeeType(String coffeeType){
		this.coffeType = coffeeType;
	}
	public void addShot(int shot){
		this.shot = shot;
	}
	public void addSyrup(int syrup){
		this.syrup = syrup;
	}
	public void addWater(int water){
		this.water = water;
	}

}
