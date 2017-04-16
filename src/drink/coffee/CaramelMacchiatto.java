package drink.coffee;

import drink.Coffee;

/**
 * Created by bomeeryu_c on 2017. 4. 14..
 */

public class CaramelMacchiatto extends Coffee {
    public CaramelMacchiatto(){
        int OriRecipeWater = 4;
        totalAmount = espressoAmount + OriRecipeWater;
    }
    public CaramelMacchiatto (int shot, int syrup, int water){
        super(shot, syrup, water);
        int OriRecipeWater = 4;
        totalAmount = espressoAmount + OriRecipeWater + water;

        infoOrder("카라멜 마키아또");
    }
}
