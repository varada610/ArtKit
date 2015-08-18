package compositePatternPackage.productPackage;

import compositePatternPackage.KitLeaf;
import compositePatternPackage.productPackage.ExpertiseLevel;
import compositePatternPackage.productPackage.Shade;

public abstract class ColoringMedium extends KitLeaf
{
    protected Shade colorShade;

    protected Shade getShade()
    {
            return this.colorShade;
    }

    protected void setShade(Shade shade)
    {
            this.colorShade = shade;
    }
}
