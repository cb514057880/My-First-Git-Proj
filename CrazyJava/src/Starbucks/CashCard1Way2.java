package Starbucks;

import java.util.Scanner;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/27 14:23
 * 4 * @
 * 5 *
 **/

public class CashCard1Way2 {
    public static void main(String[] args) {
        CashCard1 cards[] = {
                new CashCard1("A001", 100, 0),
                new CashCard1("A002", 200, 0),
                new CashCard1("A003", 300, 0),
        };

        Scanner scanner = new Scanner(System.in);
        for (CashCard1 card :cards){
            System.out.println("卡明细显示:"+'\n'+card.numeber+'\n'+card.balance+'\n'+card.bouns);
            card.store(scanner.nextInt());
            System.out.println("充值后卡明细显示:"+'\n'+card.numeber+'\n'+card.balance+'\n'+card.bouns);
        }
    }
}
