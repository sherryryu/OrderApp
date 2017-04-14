package drink;

/**
 * Created by bomeeryu_c on 2017. 4. 14..
 */

public abstract class Drinkable {
    protected int totalAmount;

    public void reduceAmount(int amount) {
        this.totalAmount -= amount;
    }

    public void setTotalAmount(int amount){
        this.totalAmount = amount;
    }

    public int getTotalAmount(){
        return totalAmount;
    }
}
