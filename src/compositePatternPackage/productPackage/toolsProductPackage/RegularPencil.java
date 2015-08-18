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
 * @author Sagar
 */
public class RegularPencil extends Tools{
    public RegularPencil() {
        this(new BeginnerLevelState());
    }
    
    public RegularPencil(ExpertiseLevelState level) {
        this.baseCost = 0.1;
        this.sizeState = null;
        this.levelState = level;
        this.parent = null;
        System.out.println("Constructor::RegularPencil");
    }
    
    @Override
    public void showDetails() {
        System.out.println("\tPencil (" 
                + levelState.getLevelDescription() + " Level)");
    }
    
    @Override
    public double getCost() {
        double totalCost = baseCost * levelState.getLevelMultiplier();
        System.out.println(toString() + " cost: " + totalCost);
        return totalCost;
    }
    
    public String toString() {
        return "RegularPencil Object";
    }
}
