package compositePatternPackage;

import implementation.BrushTip;
import implementation.ExpertiseLevel;
import implementation.Shade;

public abstract class Brush extends KitLeaf
{
    protected double baseCost;	
	//
	protected BrushTip tip;
	
	protected ExpertiseLevel level;
	
	protected BrushTip getShade()
	{
		return this.tip;
	}
	
	protected void setBrushTip(BrushTip tip)
	{
		this.tip = tip;
	}
	
	protected double getBaseCost()
	{
		return this.baseCost;
	}

}
