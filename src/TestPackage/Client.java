package TestPackage;
import compositePatternPackage.AdvancedLevelState;
import compositePatternPackage.BeginnerLevelState;
import compositePatternPackage.ExpertiseLevelState;
import compositePatternPackage.Kit;
import compositePatternPackage.LargeSizeState;
import compositePatternPackage.SizeState;
import compositePatternPackage.SmallSizeState;
import compositePatternPackage.productPackage.Shade;
import compositePatternPackage.productPackage.BrushTip;
import implementation.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        //Creating a saved kit
        SizeState smallSize = new SmallSizeState();
        ExpertiseLevelState advancedLevel = new AdvancedLevelState();
        CustomizedKitOrderDetails savedBrushes = 
                new CustomizedKitOrderDetails("MyFavBrushes", smallSize, advancedLevel);
        List<BrushTip> myBrushes = new ArrayList<BrushTip>();
        myBrushes.add(BrushTip.ANGULAR_FLAT);
        myBrushes.add(BrushTip.DETAIL_ROUND);
        myBrushes.add(BrushTip.ROUND);
        myBrushes.add(BrushTip.FILBERT);
        savedBrushes.setBrushesToMake(myBrushes);
        KitMaker brushKitMaker = new AcrylicPaintingKitMaker(savedBrushes);
        Kit favBrushKit = brushKitMaker.makeKit();
        System.out.println("**************Kit created");
        
        favBrushKit.showDetails();
        System.out.println(favBrushKit.getCost());
        
        
        //Creating a customized kit
        SizeState largeSize = new LargeSizeState();
        ExpertiseLevelState beginnerLevel = new BeginnerLevelState();
        CustomizedKitOrderDetails newOrder = 
                new CustomizedKitOrderDetails("Grade3 Acrylic Painting Kit", largeSize, beginnerLevel);
        
        newOrder.setBaseMaterialsToMake(2);
        System.out.println("**************Base material added to order");
        
        List<Shade> colors = new ArrayList<Shade>();
        colors.add(Shade.RED);
        colors.add(Shade.BLUE);
        colors.add(Shade.GREEN);
        colors.add(Shade.RED);
        colors.add(Shade.BLUE);
        colors.add(Shade.GREEN);
        newOrder.setColorsToMake(colors);
        System.out.println("**************Colors added to order");
        
        List<BrushTip> brushes = new ArrayList<BrushTip>();
        brushes.add(BrushTip.FAN);
        newOrder.setBrushesToMake(brushes);
        System.out.println("**************Brushes added to order");
        
        List<String> tools = new ArrayList<String>();
        tools.add("palette");
        tools.add("easel");
        tools.add("pencil");
        newOrder.setToolsToMake(tools);
        System.out.println("**************Tools added to order");
        
        List<Kit> savedKitList = new ArrayList<Kit>();
        savedKitList.add(favBrushKit);
        newOrder.setSavedKitsToAdd(savedKitList);
        
        KitMaker kitMaker = new AcrylicPaintingKitMaker(newOrder);
        Kit myNewKit = kitMaker.makeKit();
        System.out.println("**************Kit created");
        
        myNewKit.showDetails();
        
        DecimalFormat df = new DecimalFormat("$##,##0.00");
        System.out.println("Total Cost: " + df.format(myNewKit.getCost()));
        
        myNewKit.remove(favBrushKit);
        myNewKit.showDetails();
    }

}
