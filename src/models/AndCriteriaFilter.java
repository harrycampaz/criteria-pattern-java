package models;

import java.util.ArrayList;
import java.util.List;

public class AndCriteriaFilter implements Filter {

    Filter criteria1, criteria2;


    public AndCriteriaFilter(Filter criteria1, Filter criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {
       List<Ingredient> firstIngredient = criteria1.meetCriteria(ingredients);
        List<Ingredient> secondIngredient = criteria2.meetCriteria(firstIngredient);

//        List<Ingredient> bothCriteria = new ArrayList<Ingredient>();
//
//        for (Ingredient i: firstIngredient){
//            if(secondIngredient.contains(i)){
//                bothCriteria.add(i);
//            }
//        }

        return secondIngredient;
    }
}
