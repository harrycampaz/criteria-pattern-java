package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LocalFilter implements Filter {
    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {
        List<Ingredient> local = new ArrayList<Ingredient>();

        for (Ingredient i: ingredients){
            if(Objects.equals(i.getLocal(), "Product local")){
                local.add(i);
            }
        }
        return local;
    }
}
