package LeiYuDuiXiang;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2018/12/24 01:49
 * 4 * @
 * 5 *不可变动字符串
 **/
public class SringTest1 {
    public static void main(String[] args) {
        String name1 = "java";
        String name2 = name1 + "world";
        System.out.println(name2);

//上面代码原理
        String s = "java";
        String s1 = (new StringBuilder()).append(s).append("world").toString();
        System.out.println(s1);
//如果使用+连接字符串，会变成建立java.lang.StringBuilder对象，
// 使用其append（）方法来进行+左右两边的字符串，最后转换为toString类型返回
// 简单的说使用+连接字符串会产生新的String实例
        //不要将+用在重复性的连接场合，像是循环或递归时使用+连接字符串，这样会频繁产生新的对象，造成效能上的负担
    }
}
