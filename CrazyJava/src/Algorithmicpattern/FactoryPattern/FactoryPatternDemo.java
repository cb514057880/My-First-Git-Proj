package Algorithmicpattern.FactoryPattern;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019-07-18 13:39
 * 4 * @
 * 5 *
 **/
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

//        获取circle的对象，并调用draw方法
        Shape shape1 = shapeFactory.getShape("Circle");
//        调用circle的draw方法
        shape1.draw();
        shape1.isShape();


//        获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("Rectangle");
//        调用rectangle的draw方法
        shape2.draw();
        shape2.isShape();


//        获取square的对象，并调用draw方法
        Shape shape3 = shapeFactory.getShape("Square");
//        调用square的draw方法
        shape3.draw();
        shape3.isShape();

    }
}
