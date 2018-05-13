/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario2;

/**
 *
 * @author Heisenberg
 */
public class HighResolutionFactory implements ResolutionFactory{

    @Override
    public DisplayDriver getDisplayDriver() {
        return new HighResDisplayDriver(); 
    }

    @Override
    public PrintDriver getPrintDriver() {
        return new HighResPrintDriver(); 
    }
    
}
