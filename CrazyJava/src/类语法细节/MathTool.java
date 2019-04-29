package 类语法细节;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/30 01:12
 * 4 * @
 * 5 *5.2.6不定长度自变量
 **/
public class MathTool {
    public static int sum(int... numbers){
        int sum = 0 ;
        for (int number :numbers){
            sum += number;
        }
        return sum;
    }
    /**方法上合法声明方式,不定长度自变量一定放在最后，使用两个以上不定长度自变量也是不合法的*/
    /*
    public void some(int a ,int b,int...c){

    }*/
    /**如果使用对象的不定长度自变量，声明的方法相同*/
    /*public void some(Others...others){

    }*/



    public static void main(String[] args) {
        System.out.println(MathTool.sum(1,2,3,4,5));




    }
}
