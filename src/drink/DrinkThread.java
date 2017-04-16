package drink;

/**
 * Created by RyuBomee on 17. 4. 16..
 */


public class DrinkThread extends Thread{
    private Drinkable d;
    private int drinkingSpeed;
    public DrinkThread(Drinkable d, int drinkingSpeed){
        this.d = d;
        this.drinkingSpeed = drinkingSpeed;
    }
    @Override
    public void run(){
        while(d.getTotalAmount() > 0 ) {
            System.out.println("꿀꺽");
            d.reduceAmount(drinkingSpeed);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage() + " 예외발생");
            }
        }

    }
}
