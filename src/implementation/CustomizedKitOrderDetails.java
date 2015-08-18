/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import compositePatternPackage.BeginnerLevelState;
import compositePatternPackage.ExpertiseLevelState;
import compositePatternPackage.Kit;
import compositePatternPackage.SizeState;
import compositePatternPackage.SmallSizeState;
import compositePatternPackage.productPackage.BrushTip;
import compositePatternPackage.productPackage.Shade;
import java.util.List;

/**
 *
 * @author Aditee Nagle
 */
public class CustomizedKitOrderDetails {
    private String kitName;
    private SizeState size;
    private ExpertiseLevelState level;
    private int baseMaterialToMake;
    private List<Shade> colorsToMake;
    private List<BrushTip> brushesToMake;
    private List<String> toolsToMake;
    private List<Kit> savedKitsToAdd;
    
    public CustomizedKitOrderDetails(String name) {
        this(name, new SmallSizeState(), new BeginnerLevelState());
    }
    
    public CustomizedKitOrderDetails(String name, SizeState size, ExpertiseLevelState level) {
        this.kitName = name;
        this.size = size;
        this.level = level;
        this.baseMaterialToMake = 0;
        this.brushesToMake = null;
        this.colorsToMake = null;
        this.toolsToMake = null;
    }
    
    public String getKitName() {
        return this.kitName;
    }
    
    public void setSize(SizeState size) {
        this.size = size;
    }
    
    public SizeState getSize() {
        return this.size;
    }
    
    public void setLevel(ExpertiseLevelState level) {
        this.level = level;
    }
    
    public ExpertiseLevelState getLevel() {
        return this.level;
    }
    
    public void setBaseMaterialsToMake(int numOfBases) {
        this.baseMaterialToMake = numOfBases;
    }
    
    public int getBaseMaterialToMake() {
        return this.baseMaterialToMake;
    }
    
    public void setBrushesToMake(List<BrushTip> brushes) {
        this.brushesToMake = brushes;
    }
    
    public List<BrushTip> getBrushesToMake() {
        return this.brushesToMake;
    }
    
    public void setColorsToMake(List<Shade> colors) {
        this.colorsToMake = colors;
    }
    
    public List<Shade> getColorsToMake() {
        return this.colorsToMake;
    }
    
    public void setToolsToMake(List<String> tools) {
        this.toolsToMake = tools;
    }
    
    public List<String> getToolsToMake() {
        return this.toolsToMake;
    }
    
    public List<Kit> getSavedKitsToAdd() {
        return this.savedKitsToAdd;
    }
    
    public void setSavedKitsToAdd(List<Kit> savedKits) {
        this.savedKitsToAdd = savedKits;
    }
    
    public String toString() {
        return ("CustomizedKitOrderDetails Object for " + getKitName());
    }
    
}
