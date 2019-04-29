package 类语法细节;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/29 15:16
 * 4 * @
 * 5 *这样初始化时直接会有值，如果定义时没有赋值的话，
 * 按照默认初始化的值赋值，知道建立新的对象，P133
 * 默认的构造函数是指非人为写的构造构造函数（不管是否赋值）
 **/
public class Example1 {
    private int a = 10;
    private String text;

    public Example1(int a, String text) {
        this.a = a;
        this.text = text;
    }
}
