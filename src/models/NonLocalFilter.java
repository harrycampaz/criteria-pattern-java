package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NonLocalFilter implements Filter{
    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {
        List<Ingredient> noLocal = new ArrayList<Ingredient>();

        for (Ingredient i: ingredients){
            if(!i.getLocal().equals("Product local")){
                noLocal.add(i);
            }
        }

        return noLocal;
    }
}
