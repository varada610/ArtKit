/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryPattern;

import compositePatternPackage.productPackage.Brush;
import compositePatternPackage.productPackage.BrushTip;

/**
 *
 * @author Aditee Nagle
 */
public interface PaintingProductFactory extends ProductFactory{
    public Brush createBrush(BrushTip tip);
}
