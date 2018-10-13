package LeiYuDuiXiang;

public class Score {
    public static void main(String[] args) {
        int[] scores = {88,81,74,68,78,76,77,85,95,93};
        /*普通for循环*/
        for (int i = 0;i < scores.length;i++){
            System.out.println("学生分数:"+scores[i]);
        }
        /*增强for循环*/
//        for (int score:scores){
//            System.out.printf("学生分数："+score);
//
//        }
    }
}
