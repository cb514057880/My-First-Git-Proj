package Starbucks;

import java.util.Scanner;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/27 13:58
 * 4 * @
 * 5 *
 **/
public class CashCard1Way1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        /**调用方法部分*/

        CashCard1 card001 = new CashCard1("A001",100,0);
        System.out.println(card001.numeber+card001.balance+card001.bouns);
        System.out.println("请输入储值金额：");
        card001.store(scanner.nextInt());
        System.out.println("请输入消费的金额：");
        card001.charge(scanner.nextInt());
        System.out.println("请输入消费红利：");
        card001.exchange(scanner.nextInt());

        System.out.println(card001.bouns);




    }
}
