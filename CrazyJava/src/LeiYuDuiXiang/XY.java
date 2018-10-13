package LeiYuDuiXiang;
/*二维数组*/
public class XY {
    public static void main(String[] args) {
        int[][] cords = {
                {1,2,3},
                {4,5,6}
        };
        for (int x = 0;x<cords.length;x++){
            for (int y = 0;y<cords[x].length;y++){
                System.out.printf("shuzu"+cords[x][y]);
            }
            System.out.printf("");
        }
    }
}
