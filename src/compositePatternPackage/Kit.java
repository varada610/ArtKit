/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositePatternPackage;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Aditee
 */
public class Kit extends KitComponent{
    
    private String name;
    private Set<KitComponent> children;
    
    /*
    public Kit(String name) {
        this(name, new SmallSizeState(), new BeginnerLevelState());
    }
    */
    
    public Kit(String name, SizeState size, ExpertiseLevelState level) {
        this.name = name;
        this.sizeState = size;
        this.levelState = level;
        this.children = new HashSet<KitComponent>();
        this.parent = null;
        System.out.println("Constructor::Kit " + name);
    }
    
    public double getCost() {
        double totalCost = 0;
        for(KitComponent child: children) {
            totalCost += child.getCost();
        }
        return totalCost;
    }
    
    @Override
    public void showDetails() {
        System.out.println("----------------------------------------------------");
        System.out.println(name);
        for(KitComponent child: children) {
            child.showDetails();
        }
        System.out.println("----------------------------------------------------");
    }
    
    public void add(KitComponent component) {
        System.out.println("Adding " + component.toString() + " to " + this.getKitName());
        component.setParent(this);
        if(!component.isComposite()) {
            component.setSizeState(sizeState);
            component.setLevelState(levelState);
        }
        children.add(component);
        
    }
    
    public boolean remove(KitComponent component) {
        boolean success = children.remove(component);
        if(!success) {
            for(KitComponent child: children) {
                success = child.remove(component);
                if(success)
                    break;
            }
        }
        return success;
    }
    
    @Override
    public void setSizeState(SizeState size) {
        this.sizeState = size;
        for(KitComponent child: children) {
            if(!child.isComposite())
                child.setSizeState(size);
        }
    }
    
    @Override
    public void setLevelState(ExpertiseLevelState level) {
        this.levelState = level;
        for(KitComponent child: children) {
            if(!child.isComposite())
                child.setLevelState(level);
        }
    }
    
    public String getKitName() {
        return this.name;
    }
    
    public String toString() {
        return "Kit Object";
    }
    
    @Override
    public boolean isComposite() {
        return true;
    }
}
