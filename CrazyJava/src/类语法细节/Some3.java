package 类语法细节;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/30 00:48
 * 4 * @
 * 5 *如果对象数据成员被声明为final，但没有明确使用=指定值，那表示延迟对象成员值得指定，在构造函数执行流程中，一定要有对该数据成员指定值得动作，否则编译错误
 **/
public class Some3 {
    final int x;

    Some3(){
        this(100);
    }

    public Some3(int x) {
        this.x = x;
    }
}
