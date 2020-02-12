import models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Ingredient> ingredients = new ArrayList<Ingredient>();

        ingredients.add(new Ingredient("Queso", "Product local", true));
        ingredients.add(new Ingredient("Tomate", "Product local", true));
        ingredients.add(new Ingredient("Carne", "Product Cali", false));
        ingredients.add(new Ingredient("Pollo", "Product Bogota", false));
        ingredients.add(new Ingredient("Jamon", "Product Tura", false));
        ingredients.add(new Ingredient("Lechuga", "Product Cucuta", true));


        Filter vegeratian =  new VegerarianFilter();
        Filter local =  new LocalFilter();
        Filter nonLocal =  new NonLocalFilter();
        Filter localAndVegetarian =  new AndCriteriaFilter(local, vegeratian);
        Filter localOrVegetarian =  new OrCriteriaFilter(local, vegeratian);

        printIngredients(vegeratian.meetCriteria(ingredients), "VEGATARIANO");

        printIngredients(local.meetCriteria(ingredients), "LOCAL");

        printIngredients(nonLocal.meetCriteria(ingredients), "No LOCAL");


    }

    private static void printIngredients(List<Ingredient> ingredients, String header){


        System.out.println(header);

        for (Ingredient i: ingredients){
            System.out.println(new StringBuffer()
                    .append(i.getName())
                    .append(" : ")
                    .append(i.getLocal())
                    .append(" : ")
                    .append("Vegetarian: "+i.isVegetarian()));
        }

    }

}
