package Algorithmicpattern.AbstractFactoryPattern;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019-07-29 00:34
 * 4 * @
 * 5 *
 **/
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //获取形状为Circle的对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用Circle的draw方法
        shape1.draw();


        //获取形状为Rectangle的对象
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用Rectangle的draw方法
        shape2.draw();


        //获取形状为Square的对象
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用Circle的draw方法
        shape3.draw();



        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //获取颜色为Red的对象
        Color color1 = colorFactory.getColor("RED");

        //调用红色的fill方法
        color1.fill();

        //获取颜色为Green的对象
        Color color2 = colorFactory.getColor("GREEN");

        //调用绿色的fill方法
        color2.fill();

        //获取颜色为Blue的对象
        Color color3 = colorFactory.getColor("BLUE");

        //调用蓝色的fill方法
        color3.fill();
    }
}
