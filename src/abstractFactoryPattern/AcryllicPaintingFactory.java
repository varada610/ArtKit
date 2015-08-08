package abstractFactoryPattern;

import compositePatternPackage.BaseMaterial;
import compositePatternPackage.Canvas;

import implementation.AcryllicColor;
import implementation.Color;
import implementation.Palette;
import implementation.ProductFactory;
import implementation.Shade;
import implementation.Tools;


public class AcryllicPaintingFactory implements ProductFactory
{

	public BaseMaterial createBase() 
	{
		return new Canvas();
	}

	public Tools createTools() {
		// TODO Auto-generated method stub
		return new Palette();
	}

	public Color createColor(Shade shade) 
	{
		return new AcryllicColor(shade);
	}
	
}
