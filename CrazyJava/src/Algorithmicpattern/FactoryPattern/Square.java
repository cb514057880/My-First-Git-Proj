package Algorithmicpattern.FactoryPattern;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019-07-18 13:28
 * 4 * @
 * 5 *
 **/
public class Square implements Shape {
    @Override
    public void draw(){
        System.out.printf("inside square::draw() method."+'\n');
    }

    @Override
    public void isShape(){
        System.out.printf("这是一个正方形"+'\n');
    }
}

