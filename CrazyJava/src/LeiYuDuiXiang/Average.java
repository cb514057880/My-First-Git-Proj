package LeiYuDuiXiang;

/**
 * 2 * @Author: ChengBin
 * 3 * @Date: 2018/12/20 02:41
 * 4 * @用户命令行自变量提供整数，计算所有整数平均值
 * 5
 */
public class Average {
    public static void main(String[] args) {
        long sum = 0;
        for (String arg:args){
            sum += Long.parseLong(arg);
        }
        System.out.println("平均："+(float)sum/args.length);
    }
}
