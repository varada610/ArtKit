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
public class SmallSizeState extends SizeState{
    
    public SmallSizeState() {
        this.sizeMultiplier = 1;
    }
    
    public String getSizeDescription() {
        return "Small";
    }
    
    public String toString() {
        return "SmallSizeState Object";
    }
}
