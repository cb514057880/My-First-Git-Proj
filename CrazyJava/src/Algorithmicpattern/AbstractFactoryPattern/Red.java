package Algorithmicpattern.AbstractFactoryPattern;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019-07-25 01:46
 * 4 * @
 * 5 *
 **/
public class Red implements Color{

    @Override
    public void fill(){
        System.out.printf("inside green::fill()method.");
    }
}
