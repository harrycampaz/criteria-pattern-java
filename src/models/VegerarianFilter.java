package models;

import java.util.ArrayList;
import java.util.List;

public class VegerarianFilter implements  Filter {
    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {

        List<Ingredient> vegetarian = new ArrayList<Ingredient>();

        for (Ingredient i: ingredients){
            if(i.isVegetarian()){
                vegetarian.add(i);
            }
        }

        return vegetarian;
    }
}
