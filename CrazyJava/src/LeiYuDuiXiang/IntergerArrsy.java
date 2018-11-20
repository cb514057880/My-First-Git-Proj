package LeiYuDuiXiang;

public class IntergerArrsy {
    public static void main(String[] args) {
        //方法一
        //Integer[] scores = {new Integer(99),new Integer(87),new Integer(66)};
        //方法二
        //Integer[] scores = {99,87,66};
        //方法三
        Integer [] scores = new Integer[3];
        //方法四
        //Integer[] scores = {99,87,66};
        for (Integer score : scores){
            System.out.println(score);
        }
        //方法一
//        scores [0] = new Integer(99);
//        scores [1] = new Integer(87);
//        scores [2] = new Integer(66);
        //方法二
        scores[0] = 99;
        scores[1] = 87;
        scores[2] = 66;


        for (Integer score : scores){
            System.out.println(score);
        }
    }
}
