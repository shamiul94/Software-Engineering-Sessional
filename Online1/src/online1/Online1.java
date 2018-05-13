/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online1;

import java.util.Scanner;

/**
 *
 * @author Heisenberg
 */
public class Online1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t = 0;
        
        while (t < 10) {
            t++;
            factory fac;

            int seat;
            String ac, tool;

            Scanner sc = new Scanner(System.in);
            seat = sc.nextInt();
            ac = sc.next();
            tool = sc.next();

            fac = new factory();
            Product vehicle = fac.takeOrder(seat, ac, tool);

            System.out.println("Vehicle choosen for you: " + vehicle.getVehicleName());
            vehicle.showAccessories();
            System.out.println("Your total cost is: " + vehicle.getCost());
        }
    }

}
