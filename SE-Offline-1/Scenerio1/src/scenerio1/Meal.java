/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenerio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heisenberg
 */
public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        double cost = 0.0;
        for (Item item : items) {
            cost += item.Price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.Name());
            System.out.print(", Packing : " + item.packing().Pack());
            System.out.println(", Price : " + item.Price());
        }
    }

}
