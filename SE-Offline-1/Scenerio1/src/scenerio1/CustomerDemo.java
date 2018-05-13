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
public class CustomerDemo {
    public static void main(String[] args) {
        while(true)
        {
            CounterEmpDirector director; 
            director = new CounterEmpDirector(); 
            Meal meal = director.TakeOrder(); 
            meal.showItems();
            System.out.println("Total Cost: " + meal.getCost());
        }
    }
}
