package compositePatternPackage.productPackage.toolsProductPackage;

import compositePatternPackage.BeginnerLevelState;
import compositePatternPackage.ExpertiseLevelState;
import compositePatternPackage.SizeState;
import compositePatternPackage.SmallSizeState;
import compositePatternPackage.productPackage.Tools;

public class Palette extends Tools
{
    public Palette() {
        this(new SmallSizeState(), new BeginnerLevelState());
    }
    
    public Palette(SizeState size, ExpertiseLevelState level)
    {
        this.baseCost = 1.5;
        this.sizeState = size;
        this.levelState = level;
        this.parent = null;
        System.out.println("Constructor::Palette");
    }
    
    @Override
    public void showDetails() {
        System.out.println("\tPalette: " 
                + sizeState.getSizeDescription() + " (" 
                + levelState.getLevelDescription() + " Level)");
    }
    
    public String toString() {
        return "Palette Object";
    }
    
    public double getCost() {
        double totalCost = baseCost * levelState.getLevelMultiplier() * sizeState.getSizeMultiplier();
        System.out.println(toString() + " cost: " + totalCost);
        return totalCost;
    }
}
