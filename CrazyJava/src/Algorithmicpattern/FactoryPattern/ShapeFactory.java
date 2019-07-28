package Algorithmicpattern.FactoryPattern;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019-07-18 13:33
 * 4 * @
 * 5 *
 **/
public class ShapeFactory {
    //使用getShape 方法获取形状类型的对象

    public Shape getShape(String shapeType){
        if (shapeType==null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
