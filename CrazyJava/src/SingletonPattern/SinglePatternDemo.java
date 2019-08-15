package SingletonPattern;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019-07-31 16:12
 * 4 * @
 * 5 *
 **/
public class SinglePatternDemo {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数SingleObject（）是不可见的
        //SingleObject object = new SingleObject();
        //获取唯一的可用对象

        SingleObject object = SingleObject.getInstance();


        //显示信息
        object.showMessage();

    }
}
