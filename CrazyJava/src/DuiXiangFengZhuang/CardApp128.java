package DuiXiangFengZhuang;

import java.util.Scanner;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/2/9 23:49
 * 4 * @
 * 5 *
 **/
public class CardApp128 {
    public static void main(String[] args) {
        CashCard126[] cards = {
                new CashCard126("A00001",500,0),
                new CashCard126("A00002",600,0),
                new CashCard126("A00003",1000,1),
        };
        //System.out.println("请输入卡号：");
        Scanner scanner = new Scanner(System.in);
        for (CashCard126 card:cards){
            System.out.println("为卡号为："+card.number+"储值"+'\n'+"余额为"+card.balance+'\n'+"红利数为"+card.bonus);
            card.store(scanner.nextInt());
            System.out.println(card.number+'\n'+card.balance+'\n'+card.bonus);
        }


    }
}
