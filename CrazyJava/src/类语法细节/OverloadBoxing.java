package 类语法细节;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/29 15:37
 * 4 * @136方法重载
 * 5 *
 **/
public class OverloadBoxing {

    public static void main(String[] args) {
        Some1 some1 = new Some1();
        some1.SomeMethod(1);
        some1.SomeMethod(new Integer(1));
    }
}
