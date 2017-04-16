import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

import drink.Coffee;
import drink.coffee.Americano;
import drink.coffee.CafeMocha;
import drink.coffee.CaramelMacchiatto;
import ordermachine.coffee.CoffeeOrderMachine;
import person.Person;

/**
 * 과제 조건
 * 
 * 1. IDrinkable은 Drinkable Abstract class로 재구현한다. //done
 * 2. 사용자 인풋은 별로 중요하지 않다. 막히거나 심심하거나 할거 없을때 해보기. 이거때매 다른거 구현 못하면 안됨.
 * 3. setCoffeeType은 2가지 방법이 있다. //2번 내용 연장
 * 		3-1. String 기반으로 Coffee의 하위 클래스 생성 if(type.equals("Americano")) { 아메리카노 생성; }
 * 		3-2. java.lang.reflect.Type 을 활용하는 방법. 고오오오오오급 스킬. 시간 남을때 4-1에서 바꿔보세요.
 * 		3-3. 커피 타입은 아메리카노, 카페모카,	캬라멜마키아또 세가지가 존재한다.
 * 4. 커피 추출은 현실고증 하여 Future로 작성한다. //future로 커피가 다 끝나기 전까지 못 먹게 블로킹
 * 
 * 5. 한모금 한모금 사이의 딜레이는 0.5초. //스레드로 타임아웃
 * 
 * 6. OrderMachine을 기반으로 자판기를 구현한다.
 *  	6-1. 음료는 캔음료와 병음료가 있습니다.
 *  	6-2. Person마다 소지하고 있는 금액이 다릅니다.
 *  	6-3. 주문의 단계는 금액투입->음료->음료제공->거스름돈반환 // 음료 나오면서 거스름돈 같이
 *  	6-4. 단, 거스름돈의 동전 종류 및 거스름돈 부족은 고려하지 않는다.
 * 
 * @author Minque
 *
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee orderedMenu = null;
		CoffeeOrderMachine orderMachine = new CoffeeOrderMachine();
		
		Person bomee = new Person();
		bomee.setDrinkingSpeed(1);

		orderMachine.addShot(1);
		orderMachine.addSyrup(1);
		orderMachine.addWater(5);
		//주문한 메뉴가 아메리카노라면 setCoffeeType에 아메리카노를 넘겨준다
		orderMachine.setCoffeeType("Americano");
		orderedMenu = orderMachine.output(); //AMERICANO'

		bomee.drink(orderedMenu);


		//bomee.drink(orderedCoffee.);
		// 사용자 인풋 Option. 필수 아님
		//
		// 커피 종류, 샷 추가, 물 추가, 시럽추가
		// orderMachine.setCofeeType(..);
		// orderMachine.addShot(...);
		// orderMachine.addWater(...);
		// orderMachine.addSyrup(...);
		//
		// Coffee c = orderMachine.out(); 커피 작동, 기왕이면 Future
		// bomee.drink(c);
		
		// 녹차 마시는 보미님
		// 커피를 빨리 마셔서 힘들어서 천천히 마심
		// bomee.setDrinkSpeed(1);



	}

}
