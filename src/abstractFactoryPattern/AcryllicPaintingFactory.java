package abstractFactoryPattern;

import compositePatternPackage.*;
import implementation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class AcryllicPaintingFactory implements ProductFactory
{

	public BaseMaterial createBase() 
	{
            return new Canvas();
	}

	public Tools createTools() 
        {
            return new Palette();
	}

	public ColoringMedium createColoringMedium(Shade shade) 
	{
            return new AcryllicColor(shade);
	}
        
        public Brush createBrush(BrushTip tip)
        {
            return
        }
        
        
	
}
