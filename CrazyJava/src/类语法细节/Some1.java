package 类语法细节;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/29 15:34
 * 4 * @135-136
 * 5 *
 **/
public class Some1 {
    void SomeMethod(int i){
        System.out.println("int版本被调用");
    }

    void SomeMethod(Integer integer){
        System.out.println("integer版本被调用");
    }
}
