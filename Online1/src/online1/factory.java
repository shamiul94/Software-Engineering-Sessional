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
public class factory {

    public Product takeOrder(int seatNumber, String ac, String tool) {
        Product vehicle = new Product();
        if (seatNumber <= 5) {
            vehicle.addPrivateCar();
            for (int i = 0; i < seatNumber; i++) {
                vehicle.addSeat();
            }
        } else if (seatNumber <= 10) {
            vehicle.addMicro();
            for (int i = 0; i < seatNumber; i++) {
                vehicle.addSeat();
            }
        }

        if (ac.equalsIgnoreCase("y")) {
            vehicle.addAC();
        }

        if (tool.equalsIgnoreCase("y")) {
            vehicle.addTool();
        }

        return vehicle;
    }
}
