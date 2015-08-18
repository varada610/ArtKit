package compositePatternPackage;

public abstract class KitComponent implements Cloneable
{
    //public abstract void showDetails(int numBlanks);    
    //numBlanks = number of blank spaces to be 
    //added before each line of details (to get tabbed view)
    protected SizeState sizeState;
    protected ExpertiseLevelState levelState;
    protected Kit parent;
    
    public abstract double getCost();
    
    /**
     * 
     * @param numBlanks - number of blank spaces to be added before 
     * line of description (to get tree view)
     */
    public abstract void showDetails();
    public abstract void add(KitComponent component);
    public abstract boolean remove(KitComponent component);
        
    public void setSizeState(SizeState size) {
        this.sizeState = size;
    }
    
    public SizeState getSizeState() {
        return this.sizeState;
    }
    
    public void setLevelState(ExpertiseLevelState level) {
        this.levelState = level; 
    }
    
    public ExpertiseLevelState getLevelState() {
        return this.levelState;
    }
    
    public void setParent(Kit parentKit) {
        this.parent = parentKit;
    }
    
    public Kit getParent() {
        return this.parent;
    }
    
    public boolean isComposite() {
        return false;
    }
    
}
