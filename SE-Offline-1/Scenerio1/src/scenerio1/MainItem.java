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
public abstract class MainItem implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
