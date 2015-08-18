package compositePatternPackage.productPackage.acrylicProductPackage;

import compositePatternPackage.BeginnerLevelState;
import compositePatternPackage.ExpertiseLevelState;
import compositePatternPackage.SizeState;
import compositePatternPackage.SmallSizeState;
import compositePatternPackage.productPackage.ColoringMedium;
import compositePatternPackage.productPackage.Shade;

public class AcrylicColor extends ColoringMedium
{
    private int basicVolumeOz;
    
    public AcrylicColor(Shade shade)
    {
        this(shade, new SmallSizeState(), new BeginnerLevelState());
        System.out.println("Constructor::AcrylicColor " + shade);
            
    }
    
    public AcrylicColor(Shade shade, SizeState size, ExpertiseLevelState level) {
        this.colorShade = shade;
        this.sizeState = size;
        this.levelState = level;
        this.basicVolumeOz = 2;
        this.baseCost = 6;
        this.parent = null;
    }
    
    @Override
    public void showDetails() {
        System.out.println("\tAcrylic Color: " 
                + getPaintVolumeOz() + " oz tube (" 
                + levelState.getLevelDescription() + " Level)");
    }
    
    public int getPaintVolumeOz() {
        return (getBasicVolumeOz() * sizeState.getSizeMultiplier());
    }
    
    public void setBasicVolumeOz(int oz) {
        this.basicVolumeOz = oz;
    }
    
    public int getBasicVolumeOz() {
        return this.basicVolumeOz;
    }
    
    public String toString() {
        return "AcrylicColor Object";
    }
    
    public double getCost() {
        double totalCost = baseCost * levelState.getLevelMultiplier() * sizeState.getSizeMultiplier();
        System.out.println(toString() + " cost: " + totalCost);
        return totalCost;
    }
	
}
