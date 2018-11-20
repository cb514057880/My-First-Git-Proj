package LeiYuDuiXiang;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int [] score1 = {88,81,74,68,78,76,66,85,95,93};
        int [] score2 = new int[score1.length];
       /* //基本做法是另行新建数组
        for (int i = 0;i<score1.length;i++){
            score2[i] = score1[i];
        }
        for (int i1 = 0; i1<score2.length;i1++){
        System.out.println(score2[i1]);
        }*/

       //使用system.arraycopy()方法
        /* System.arraycopy(score1,0,score2,0,score1.length);
         for (int score : score2){
             System.out.println(score);
         }*/


        //JDK6以上Array.copyof方法
        int [] score3 = {88,81,74,68,78,76,66,85,95,93};
        int [] score4 = Arrays.copyOf(score3,score3.length);
        for (int score :score4){
            System.out.println(score);
        }
        System.out.println();
        score4[0] = 99;
        //不影响score3的参考数组对象
        for (int score : score3){
            System.out.println(score);
        }

    }
}
