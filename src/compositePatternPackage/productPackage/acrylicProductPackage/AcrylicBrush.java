/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositePatternPackage.productPackage.acrylicProductPackage;

import compositePatternPackage.BeginnerLevelState;
import compositePatternPackage.ExpertiseLevelState;
import compositePatternPackage.SizeState;
import compositePatternPackage.SmallSizeState;
import compositePatternPackage.productPackage.Brush;
import compositePatternPackage.productPackage.BrushTip;

/**
 *
 * @author Sagar
 */
public class AcrylicBrush extends Brush {
    
    public AcrylicBrush(BrushTip tip) {
        this(tip, new SmallSizeState(), new BeginnerLevelState());
    }
    
    public AcrylicBrush(BrushTip tip, SizeState size, ExpertiseLevelState level) {
        this.basicDimension = 4;     //default dimension set here
        this.tipType = tip;
        this.sizeState = size;
        this.levelState = level;
        this.baseCost = 2;
        this.parent = null;
        System.out.println("Constructor::AcrylicBrush " + tipType);
    }
    
    @Override
    public void showDetails() {
        System.out.println("\tAcrylic Brush: "
                + "Size " + getDimension() + " (" + 
                levelState.getLevelDescription() + " Level)");
    }
    
    public String toString() {
        return "AcrylicBrush Object";
    }
    
    public double getCost() {
        double totalCost = baseCost * levelState.getLevelMultiplier() * sizeState.getSizeMultiplier();
        System.out.println(toString() + " cost: " + totalCost);
        return totalCost;
    }
}
