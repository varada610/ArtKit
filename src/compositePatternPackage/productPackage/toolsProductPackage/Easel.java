/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositePatternPackage.productPackage.toolsProductPackage;

import compositePatternPackage.BeginnerLevelState;
import compositePatternPackage.ExpertiseLevelState;
import compositePatternPackage.SizeState;
import compositePatternPackage.SmallSizeState;
import compositePatternPackage.productPackage.Tools;

/**
 *
 * @author Aditee
 */
public class Easel extends Tools {
    private int basicHeightInch;
    
    public Easel() {
        this(new SmallSizeState(), new BeginnerLevelState());
    }
    public Easel(SizeState size, ExpertiseLevelState level) {
        this.basicHeightInch = 20;
        this.baseCost = 10;
        this.sizeState = size;
        this.levelState = level;
        this.parent = null;
        System.out.println("Constructor::Easel");
    }
    
    public void setBasicHeightInch(int height) {
        this.basicHeightInch = height;
    }
    
    public int getBasicHeightInch() {
        return this.basicHeightInch;
    }
    
    public int getHeight() {
        return (getBasicHeightInch() * sizeState.getSizeMultiplier());
    }
    
    @Override
    public void showDetails() {
        System.out.println("\tEasel: " 
                + getHeight() + "\" (" 
                + levelState.getLevelDescription() + " Level)");
    }
    
    public String toString() {
        return "Easel Object";
    }
    
    public double getCost() {
        double totalCost = baseCost * levelState.getLevelMultiplier() * sizeState.getSizeMultiplier();
        System.out.println(toString() + " cost: " + totalCost);
        return totalCost;
    }
}
