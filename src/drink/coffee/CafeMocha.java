package drink.coffee;

import drink.Coffee;

/**
 * Created by bomeeryu_c on 2017. 4. 14..
 */

public class CafeMocha extends Coffee{

    public CafeMocha(){
        int OriRecipeWater = 4;
        totalAmount = espressoAmount + OriRecipeWater;
    }
    public CafeMocha (int shot, int syrup, int water){
        super(shot, syrup, water);
        int OriRecipeWater = 4;
        totalAmount = espressoAmount + OriRecipeWater + water;

        infoOrder("카페모카");
    }

}
