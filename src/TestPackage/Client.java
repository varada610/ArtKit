package TestPackage;
import abstractFactoryPattern.ProductFactory;
import abstractFactoryPattern.*;
import implementation.*;
import java.util.ArrayList;
import java.util.List;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{       
		ProductFactory factory = new AcryllicPaintingFactory();
		factory.createBase();
                
                List<Shade>requestedColors = new ArrayList<Shade>();
                requestedColors.add(Shade.BLUE);
                requestedColors.add(Shade.GREEN);
                for(Shade shade: requestedColors)
                {
                    factory.createColoringMedium(shade);
                }
		
		factory.createTools();
		
	}

}
