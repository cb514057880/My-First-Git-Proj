package Algorithmicpattern.FactoryPattern;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019-07-18 13:22
 * 4 * @
 * 5 *
 **/
public class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.printf("inside rectangle::draw() method."+'\n');
    }

    @Override
    public void isShape(){
        System.out.printf("这是一个三角形"+'\n');
    }
}
