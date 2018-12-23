package LeiYuDuiXiang;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2018/12/24 02:30
 * 4 * @Stringbuilder改善频繁产生新对象的问题
 * 5 *
 **/
public class OneTo100 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        //每次循环后都是重新放回到stringBuilder对象，所以全程就只用了这一个对象
        for (int i = 1;i<100;i++){
            stringBuilder.append(i).append('+');
        }
        //下面第一种输出方法好像有错误
        System.out.println(stringBuilder.append(100).toString());
        System.out.println(stringBuilder);
    }
}
