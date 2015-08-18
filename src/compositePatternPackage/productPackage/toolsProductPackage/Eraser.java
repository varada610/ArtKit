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
public class Eraser extends Tools {
    
    public Eraser() {
        this(new SmallSizeState(), new BeginnerLevelState());
    }
    public Eraser(SizeState size, ExpertiseLevelState level) {
        this.baseCost = 0.5;
        this.sizeState = size;
        this.levelState = level;
        this.parent = null;
        System.out.println("Constructor::Eraser");
    }
    
    @Override
    public void showDetails() {
        System.out.println("\tEraser: " 
                + sizeState.getSizeDescription() + " (" 
                + levelState.getLevelDescription() + " Level)");
    }
    
    public String toString() {
        return "Eraser Object";
    }
    
    public double getCost() {
        double totalCost = baseCost * levelState.getLevelMultiplier() * sizeState.getSizeMultiplier();
        System.out.println(toString() + " cost: " + totalCost);
        return totalCost;
    }
}
