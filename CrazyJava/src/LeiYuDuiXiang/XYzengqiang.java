package LeiYuDuiXiang;

public class XYzengqiang {
    public static void main(String[] args) {
        int[][] cords = {
                {1,2,3},
                {4,5,6}
        };
        for (int [] row:cords){
            for (int value : row){
                System.out.printf("%2d",value);
            }
            System.out.println();
        }
    }
}
