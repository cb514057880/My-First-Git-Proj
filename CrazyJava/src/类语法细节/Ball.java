package 类语法细节;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/30 00:59
 * 4 * @
 * 5 *
 **/
public class Ball {
    double redius;
    //这样写是为了避免，每次新建对象都有一个PI
    static final double PI = 3.1415926;
    //被声明为static方法，也是将类名称作为名称空间，可以通过类名称与"."运算符来调用,一定要通过类调用不要通过对象调用类内的static方法
    static double toRedians(double angdeg){
        //角度转经度
        return angdeg*(Ball.PI/180);
    }

    public static void main(String[] args) {
        System.out.println(Ball.toRedians(100));
    }

}
