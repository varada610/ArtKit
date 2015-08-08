package compositePatternPackage;

import implementation.ExpertiseLevel;
import implementation.Shade;

public abstract class Color extends KitLeaf
{
	protected double baseCost;	
	//
	protected Shade colorShade;
	
	protected ExpertiseLevel level;
	
	protected Shade getShade()
	{
		return this.colorShade;
	}
	
	protected void setShade(Shade shade)
	{
		this.colorShade = shade;
	}
	
	protected double getBaseCost()
	{
		return this.baseCost;
	}

}
