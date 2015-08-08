package implementation;

public abstract class Tools 
{
	protected double baseCost;	
	//
	protected int size;
	
	protected ExpertiseLevel level;
	
	protected int getSize()
	{
		return this.size;
	}
	
	protected void setSize(int size)
	{
		this.size = size;
	}
	
	protected double getBaseCost()
	{
		return this.baseCost;
	}
	
	protected ExpertiseLevel getLevel()
	{
		return this.level;
	}
}
