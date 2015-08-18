/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositePatternPackage;

/**
 *
 * @author Aditee Nagle
 */
public abstract class SizeState {
    protected int sizeMultiplier;
    
    public int getSizeMultiplier() {
        return this.sizeMultiplier;
    } 
    
    public abstract String getSizeDescription();
    
}
