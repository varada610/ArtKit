package compositePatternPackage;

public abstract class KitLeaf extends KitComponent
{
    protected double baseCost;
    
    public void setBaseCost(double cost) {
        this.baseCost = cost;
    }
    
    public double getBaseCost() {
        return this.baseCost;
    }
    
    public double getCost() {
        return baseCost * sizeState.getSizeMultiplier() * levelState.getLevelMultiplier();
    }
    
    public void add(KitComponent component) {
        System.out.println("Invalid operation. Cannot add to leaf component.");
    }
    public boolean remove(KitComponent component) {
        System.out.println("Invalid operation. Cannot remove from leaf component.");
        return false;
    }
}
