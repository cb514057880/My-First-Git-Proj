package LeiYuDuiXiang;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2018/12/24 02:24
 * 4 * @疯狂javaP112
 * 5 *
 **/
public class StringTest4 {
    public static void main(String[] args) {
        String text = "";
        for (int i=1;i<100;i++){
            text = text+i+'+';
        }
        System.out.println(text+100);
    }
}
