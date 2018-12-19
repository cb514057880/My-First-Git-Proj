package LeiYuDuiXiang;

import java.util.Scanner;

/**
 * 2 * @Author: ChengBin
 * 3 * @Date: 2018/12/20 02:22
 * 4 * @用户输入整数，输入0后会计算所有整数总和并显示
 * 5 *
 */
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        long number = 0;
        do {
            System.out.println("输入数字:");
            //将number剖析成long整数
            number = Long.parseLong(scanner.nextLine());
            sum += number;
        }while (number != 0);
        /*number为任意数，while里条件为真，所以解读为当number不等于0时，一直执行do中的循环内容，与while循环不同，do-while至少会执行
        * 一次循环体中的内容*/
        System.out.println("总和："+sum);
    }
}
