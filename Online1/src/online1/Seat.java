/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online1;

/**
 *
 * @author Heisenberg
 */
public class Seat implements Accessories {

    @Override
    public String showAccessories() {
        return "Seat";
    }

    @Override
    public double Price() {
        return 300;
    }
}
