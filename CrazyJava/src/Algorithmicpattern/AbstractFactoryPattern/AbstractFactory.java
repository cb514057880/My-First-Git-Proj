package Algorithmicpattern.AbstractFactoryPattern;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019-07-25 01:50
 * 4 * @
 * 5 *
 **/
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
