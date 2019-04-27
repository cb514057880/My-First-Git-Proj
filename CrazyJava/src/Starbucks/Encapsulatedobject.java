package Starbucks;

import java.util.Scanner;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/27 13:33
 * 4 * @封装对象操作流程
 * 5 *
 **/
public class Encapsulatedobject {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
//        CashCard card4 = new CashCard("A001",500,0);
        /**输入的钱数等于等于扫描台输入数据*/
        int money = scanner.nextInt();
        CashCard card4 = new CashCard("A001",500,0);
        if (money >= 0){
            card4.balance += money;
            if (money >= 1000){
                card4.bouns++;
            }
        }else{
            System.out.println("储值不能为负值，请检查后重新输入");
        }



        CashCard card5 = new CashCard("A002",300,0);
        money = scanner.nextInt();
        if (money >= 0){
            card5.balance += money;
            if (money >= 1000){
                card5.bouns++;
            }
        }else{
            System.out.println("储值不能为负值，请检查后重新输入");
        }


        System.out.println(card4.number+card4.balance+card4.bouns);
        System.out.println(card5.number+card5.balance+card5.bouns);

    }

}
