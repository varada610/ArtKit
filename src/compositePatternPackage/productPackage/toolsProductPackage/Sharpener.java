/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositePatternPackage.productPackage.toolsProductPackage;

import compositePatternPackage.BeginnerLevelState;
import compositePatternPackage.ExpertiseLevelState;
import compositePatternPackage.productPackage.Tools;

/**
 *
 * @author Aditee
 */
public class Sharpener extends Tools {
    public Sharpener() {
        this(new BeginnerLevelState());
    }
    public Sharpener(ExpertiseLevelState level) {
        this.baseCost = 0.25;
        this.sizeState = null;
        this.levelState = level;
        this.parent = null;
        System.out.println("Constructor::Sharpener");
    }
    
    @Override
    public void showDetails() {
        System.out.println("\tPencil Sharpener (" + levelState.getLevelDescription() + " Level)");
    }
    
    @Override
    public double getCost() {
        double totalCost = baseCost * levelState.getLevelMultiplier();
        System.out.println(toString() + " cost: " + totalCost);
        return totalCost;
    }
    
    public String toString() {
        return "Sharpener Object";
    }
}
