package Algorithmicpattern.AbstractFactoryPattern;

import com.sun.org.apache.regexp.internal.RE;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019-07-25 01:51
 * 4 * @
 * 5 *
 **/
public class ShapeFactory extends AbstractFactory{

    @Override

    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color){
        return null;
    }
}
