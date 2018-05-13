/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heisenberg
 */
public class Product {
    private Car vehicle ; 
    private final List<Accessories> acc = new ArrayList<>();
    
    void addPrivateCar()
    {
        vehicle = new PrivateCar();
    }
    
    void addMicro()
    {
        vehicle = new Micro(); 
    }
    
    String getVehicleName()
    {
        return vehicle.showSelectedCar(); 
    }
    
    void showAccessories()
    {
        for (Accessories accs: acc)
        {
            System.out.println(accs.showAccessories()+" was added. cost : " + accs.Price());
        }
    }
    
    void addSeat()
    {
        acc.add(new Seat()); 
    }
    void addAC()
    {
        acc.add(new AC()); 
    }
    
    void addTool()
    {
        acc.add(new Tools()); 
    }
    
    double getCost()
    {
        double price = 0 ; 
        price += vehicle.Price(); 
        
        for (Accessories accs: acc)
        {
            price += accs.Price(); 
        }
        return price; 
    }
}
