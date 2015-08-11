package abstractFactoryPattern;

import compositePatternPackage.*;
import implementation.Shade;
import implementation.Tools;
import java.util.List;
import java.util.Map;

public interface ProductFactory 
{
	public BaseMaterial createBase();
	public Tools createTools();
	public ColoringMedium createColoringMedium(Shade shade);
	
}
