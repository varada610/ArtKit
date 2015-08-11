package implementation;

import compositePatternPackage.ColoringMedium;

//concrete
public class AcryllicColor extends ColoringMedium
{
	public AcryllicColor(Shade shade)
	{
		this.colorShade = shade;
		System.out.println("In Acryllic color");
	}
	
}
