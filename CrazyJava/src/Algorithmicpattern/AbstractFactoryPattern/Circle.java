package Algorithmicpattern.AbstractFactoryPattern;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019-07-25 01:45
 * 4 * @
 * 5 *
 **/
public class Circle implements Shape {
    @Override
    public void draw(){
        System.out.printf("inside circle::draw() method.");
    }
}
