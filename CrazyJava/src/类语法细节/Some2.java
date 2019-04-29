package 类语法细节;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/30 00:32
 * 4 * @
 * 5 *P136页下面,构造函数调用另一个已定义的构造函数
 **/
public class Some2 {
    private int a = 10;
    private String text="n.a.";

    public Some2(int a) {
        this.a = a;
    }

    public Some2(int a, String text) {
        //重复构造
       // this.a = a;
        //构造函数调用另一个已定义的构造函数
        this(a);
        this.text = text;
    }
}
