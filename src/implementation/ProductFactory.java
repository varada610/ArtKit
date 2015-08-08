package implementation;

import compositePatternPackage.BaseMaterial;

public interface ProductFactory 
{
	public BaseMaterial createBase();
	public Tools createTools();
	public Color createColor(Shade shade);
	
}
