package compositePatternPackage.productPackage.acrylicProductPackage;

import compositePatternPackage.BeginnerLevelState;
import compositePatternPackage.ExpertiseLevelState;
import compositePatternPackage.KitComponent;
import compositePatternPackage.SizeState;
import compositePatternPackage.SmallSizeState;
import compositePatternPackage.productPackage.BaseMaterial;


public class Canvas extends BaseMaterial
{
    private int basicHeightInch;
    private int basicWidthInch;
    
    public Canvas()
    {
        this(10, 8, new SmallSizeState(), new BeginnerLevelState());
    }
    
    public Canvas(int height, int width) {
        this(height, width, new SmallSizeState(), new BeginnerLevelState());
    }
    
    public Canvas(int height, int width, SizeState size, ExpertiseLevelState level) {
        this.basicHeightInch = height;
        this.basicWidthInch = width;
        this.sizeState = size;
        this.levelState = level;
        this.baseCost = 3.0;
        this.parent = null;
        System.out.println("Constructor::Canvas");
    }
    
    @Override
    public void showDetails() {
        System.out.println("\tCanvas: " + 
                getWidth() + "\" X " + getHeight() +
                "\" (" + levelState.getLevelDescription() + " Level)");
    }
    
    public int getWidth() {
        if(this.sizeState != null) {
            return basicWidthInch * sizeState.getSizeMultiplier();
        } else {
            return basicWidthInch;
        }
    }
    
    public void setBasicWidth(int w) {
        this.basicWidthInch = w;
    }
    
    public int getHeight() {
        if(this.sizeState != null) {
            return basicHeightInch * sizeState.getSizeMultiplier();
        } else {
            return basicHeightInch;
        }
    }
    
    public void setBasicHeight(int h) {
        this.basicHeightInch = h;
    }
    
    public String toString() {
        return "Canvas Object";
    }
    
    public double getCost() {
        double totalCost = baseCost * levelState.getLevelMultiplier() * sizeState.getSizeMultiplier();
        System.out.println(toString() + " cost: " + totalCost);
        return totalCost;
    }
}
