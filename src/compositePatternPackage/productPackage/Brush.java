package compositePatternPackage.productPackage;

import compositePatternPackage.KitLeaf;
import compositePatternPackage.productPackage.BrushTip;
import compositePatternPackage.productPackage.ExpertiseLevel;
import compositePatternPackage.productPackage.Shade;

public abstract class Brush extends KitLeaf
{
    protected int basicDimension;
    protected BrushTip tipType;
    
    public int getDimension() {
        return (getBasicDimension() * sizeState.getSizeMultiplier());
    }
    
    public int getBasicDimension() {
        return this.basicDimension;
    }
    
    public void setBasicDimension(int dimension) {
        this.basicDimension = dimension;
    }
    
    protected BrushTip getBrushTipType() {
        return this.tipType;
    }
    
    protected void setBrushTipType(BrushTip tip) {
        this.tipType = tip;
    }

}
