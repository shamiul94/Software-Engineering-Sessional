/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario2;

import java.util.Scanner;

/**
 *
 * @author Heisenberg
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        while (true) {
            System.out.println("1.High Resolution\n2.Low Resolution");

            ApControl apc = new ApControl();

            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();

            if (c == 1) {
                ResolutionFactory Computer = apc.makeComputer("high");
                System.out.println(Computer.getDisplayDriver().Display());
                System.out.println(Computer.getPrintDriver().Print());
            } else if (c == 2) {
                ResolutionFactory Computer = apc.makeComputer("low");
                System.out.println(Computer.getDisplayDriver().Display());
                System.out.println(Computer.getPrintDriver().Print());
            }

        }
    }
}
