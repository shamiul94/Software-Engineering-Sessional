/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenerio1;

/**
 *
 * @author Heisenberg
 */
public class MealBuilder {
    public Meal PrepareChildrenMeal(String Main, String Side, String Toy , String Drink)
    {
        Meal meal = new Meal(); 
        if(Main.equalsIgnoreCase("hamburger"))
        {
            meal.addItem(new HamBurger());
        }
        else if(Main.equalsIgnoreCase("cheeseburger"))
        {
            meal.addItem(new CheeseBurger());
        }
        else if(Main.equalsIgnoreCase("chicken"))
        {
            meal.addItem(new Chicken());
        }
        
        if(Side.equalsIgnoreCase("fries"))
        {
            meal.addItem(new Fries());
        }
        else if(Side.equalsIgnoreCase("coleslaw"))
        {
            meal.addItem(new ColeSlaw());
        }
        
        if(Toy.equalsIgnoreCase("dino"))
        {
            meal.addItem(new ToyDino());
        }
        else if(Toy.equalsIgnoreCase("car"))
        {
            meal.addItem(new ToyCar());
        }
        
        
        if(Drink.equalsIgnoreCase("pepsi"))
        {
            meal.addItem(new Pepsi());
        }
        else if(Drink.equalsIgnoreCase("coke"))
        {
            meal.addItem(new Coke());
        }
            
        return meal ; 
    }
}
