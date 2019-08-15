package SingletonPattern;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019-07-31 16:08
 * 4 * @
 * 5 *
 **/
public class SingleObject {

    //创建SingleObject的一个对象

    private static SingleObject instance = new SingleObject();

    //让构造函数为private，这样该类就不会被实例化

    private SingleObject(){}

    //获取唯一可用的对象

    public static SingleObject getInstance(){
        return instance;
    }

    public void  showMessage(){
        System.out.printf("Hello world");
    }

}
