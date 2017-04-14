import drink.GreenTea;
import ordermachine.coffee.CoffeeOrderMachine;
import person.Person;

/**
 * 과제 조건
 * 
 * 1. IDrinkable은 Drinkable Abstract class로 재구현한다.
 * 2. 사용자 인풋은 별로 중요하지 않다. 막히거나 심심하거나 할거 없을때 해보기. 이거때매 다른거 구현 못하면 안됨.
 * 3. 커피 추출은 현실고증 하여 Future로 작성한다.
 * 4. setCoffeeType은 2가지 방법이 있다.
 * 		4-1. String 기반으로 Coffee의 하위 클래스 생성 if(type.equals("Americano")) { 아메리카노 생성; }
 * 		4-2. java.lang.reflect.Type 을 활용하는 방법. 고오오오오오급 스킬. 시간 남을때 4-1에서 바꿔보세요. 
 * 
 * 5. 한모금 한모금 사이의 딜레이는 0.5초.
 * 
 * 6. OrderMachine을 기반으로 자판기를 구현한다.
 *  	6-1. 음료는 캔음료와 병음료가 있습니다.
 *  	6-2. Person마다 소지하고 있는 금액이 다릅니다.
 *  	6-3. 주문의 단계는 금액투입->음료->음료제공->거스름돈반환
 *  	6-4. 단, 거스름돈의 동전 종류 및 거스름돈 부족은 고려하지 않는다.
 * 
 * @author Minque
 *
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CoffeeOrderMachine orderMachine = new CoffeeOrderMachine();
		
		Person bomee = new Person();
		bomee.setDrinkingSpeed(100);
		
		
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
		GreenTea bomeesGreenTea = new GreenTea();
		bomee.drink(bomeesGreenTea);
	}

}
