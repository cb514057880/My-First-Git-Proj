package 类语法细节;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/30 00:37
 * 4 * @
 * 5 *在这个范例中，调用了other（int o）版本的构造函数，其中使用的this（）调用了Other版本的构造函数，
 * 如果撰写了对象初始区块，对象建立之后会先执行对象初始化区块，接着才调用制定的构造函数
 **/

class Other{
    {
        System.out.println("对象初始区");
    }

    Other(){
        System.out.println("Other() 构造函数");

    }


    Other(int o){
        this();
        System.out.println("Other(int 0)  构造函数");
    }
}
public class ObjectlniyialBlock {

    public static void main(String[] args) {
        new Other(1);
    }
}
