package 类语法细节;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/29 15:27
 * 4 * @构造函数与方法重载
 * 5 *P134
 **/
public class Some0 {
    private int a  = 10;
    private String text = "n.a.";
//创建对象方式一
    public Some0(int a) {
        if (a > 0){
            this.a = a;
        }
    }

//创建对象方式二
    public Some0(int a, String text) {
        if (a > 0){
            this.a = a;
        }
        if (text != null){
            this.text = text;
        }

    }
}
