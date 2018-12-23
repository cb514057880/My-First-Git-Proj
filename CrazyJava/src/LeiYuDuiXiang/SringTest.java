package LeiYuDuiXiang;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2018/12/20 02:55
 * 4 * @字符串常量和字符串常量池
 * 5 *
 **/
public class SringTest {
    public static void main(String[] args) {
        char[] name = {'j', 'u', 's', 't', 'i', 'n'};
        //输出效果不对如何解决
        System.out.println("输出char name的内容是："+ name.toString());
//        name1能够打印出justin，内容是char中的name
        String name1 = new String(name);
        System.out.println(name1);
        String name2 = new String(name);
        //name1和name2之所以打印false是因为new了一个新的String对象所以，虽然内容一样但是并不是指向一个东西
        System.out.println(name2);
        System.out.println(name1 == name2);
        //使用equals后显示true是因为比较字符串实际字符内容是相同的
        System.out.println(name1.equals(name2));

        //下面这部分代码显示为true是因为name3相当于在字符串池中
        String name3 = "JUSTIN";
        String name4 = "JUSTIN";
        System.out.println(name3 == name4);

    }
}
