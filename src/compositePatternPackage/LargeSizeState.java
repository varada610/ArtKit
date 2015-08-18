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
public class LargeSizeState extends SizeState{
    
    public LargeSizeState() {
        this.sizeMultiplier = 2;
    }
    
    public String getSizeDescription() {
        return "Large";
    }
    
    public String toString() {
        return "LargeSizeState Object";
    }
}
