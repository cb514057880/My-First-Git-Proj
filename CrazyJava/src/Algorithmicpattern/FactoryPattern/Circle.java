package Algorithmicpattern.FactoryPattern;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019-07-18 13:29
 * 4 * @
 * 5 *
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.printf("inside circle::draw()method."+'\n');
    }

    @Override
    public void isShape(){
        System.out.printf("这是一个圆形"+'\n');
    }
}
