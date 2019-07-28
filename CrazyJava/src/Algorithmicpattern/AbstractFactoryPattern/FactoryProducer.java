package Algorithmicpattern.AbstractFactoryPattern;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019-07-29 00:32
 * 4 * @
 * 5 *
 **/
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if (choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }

}
