package abstractFactoryPattern;

import compositePatternPackage.productPackage.ColoringMedium;
import compositePatternPackage.productPackage.BaseMaterial;
import compositePatternPackage.productPackage.acrylicProductPackage.Canvas;
import compositePatternPackage.productPackage.Brush;
import compositePatternPackage.productPackage.toolsProductPackage.Sharpener;
import compositePatternPackage.productPackage.BrushTip;
import compositePatternPackage.productPackage.Tools;
import compositePatternPackage.productPackage.Shade;
import compositePatternPackage.productPackage.toolsProductPackage.Eraser;
import compositePatternPackage.productPackage.toolsProductPackage.RegularPencil;
import compositePatternPackage.productPackage.toolsProductPackage.Easel;
import compositePatternPackage.productPackage.acrylicProductPackage.AcrylicBrush;
import compositePatternPackage.productPackage.acrylicProductPackage.AcrylicColor;
import compositePatternPackage.productPackage.toolsProductPackage.Palette;
import compositePatternPackage.*;
import implementation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class AcrylicProductsFactory implements PaintingProductFactory
{

    public BaseMaterial createBase() 
    {
        return new Canvas();
    }

    public Tools createTools(String toolName) 
    {
        switch(toolName){
            case "palette" :
                return new Palette();
            case "pencil" :
                return new RegularPencil();
            case "easel" :
                return new Easel();
            case "sharpener":
                return new Sharpener();
            case "eraser":
                return new Eraser();
            default:
                return null;
        }

    }

    public ColoringMedium createColoringMedium(Shade shade) 
    {
        return new AcrylicColor(shade);
    }

    public Brush createBrush(BrushTip tip)
    {
        return new AcrylicBrush(tip);
    }

    public String toString() {
        return "AcrylicProductsFactory Object";
    }
	
}
