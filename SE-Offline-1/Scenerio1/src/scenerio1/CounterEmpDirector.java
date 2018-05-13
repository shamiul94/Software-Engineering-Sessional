/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenerio1;

import java.util.Scanner;

/**
 *
 * @author Heisenberg
 */
public class CounterEmpDirector {
    public Meal TakeOrder()
    {
        String Main = "hamburger" , Side = "fries" , Toy = "dino" , Drink = "pepsi" ; 
        MealBuilder builder = new MealBuilder(); 
        Meal meal = new Meal(); 
        
        System.out.println("Choose Main Item:");
        System.out.println("1.Ham Burger\n2.Cheese Burger\n3.Chicken");
        
        Scanner sc1 = new Scanner(System.in); 
        int c; 
        c = sc1.nextInt(); 
        
        if(c == 1)
        {
            Main = "hamburger";
        }
        else if(c == 2)
        {
            Main = "cheeseburger";
        }
        else if(c == 3)
        {
            Main = "chicken";
        }
        
        System.out.println("Choose Side Item:");
        System.out.println("1.Fries\n2.Cole Slaw");
        
        c = sc1.nextInt(); 
        
        if(c == 1)
        {
            Side = "fries";
        }
        else if(c == 2)
        {
            Side = "coleslaw";
        }
        
        System.out.println("Choose Toy Item:");
        System.out.println("1.Toy Dinosaur\n2.Toy Car");
        
        c = sc1.nextInt(); 
        
        if(c == 1)
        {
            Toy = "dino";
        }
        else if(c == 2)
        {
            Toy = "car";
        }
        
        
        System.out.println("Choose Drink:");
        System.out.println("1.Pepsi\n2.Coke");
        
        c = sc1.nextInt(); 
        
        if(c == 1)
        {
            Drink = "pepsi";
        }
        else if(c == 2)
        {
            Drink = "coke";
        }
        
        meal = builder.PrepareChildrenMeal(Main, Side, Toy, Drink);
        
        return meal ; 
    }
}
