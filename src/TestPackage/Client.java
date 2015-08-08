package TestPackage;
import abstractFactoryPattern.AcryllicPaintingFactory;
import implementation.*;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ProductFactory factory = new AcryllicPaintingFactory();
		factory.createBase();
		factory.createColor(Shade.BLUE);
		factory.createTools();
		
	}

}
