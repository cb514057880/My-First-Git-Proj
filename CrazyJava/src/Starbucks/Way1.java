package Starbucks;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/27 13:19
 * 4 * @第一种对构造方法的使用方式
 * 5 *
 **/
public class Way1 {
    public static void main(String[] args) {
        CashCard card1 = new CashCard("001",100,0);
        CashCard card2 = new CashCard("002",150,0);
        CashCard card3 = new CashCard("003",200,0);
        System.out.println("卡号:"+card1.number+'\n'+"卡内余额:"+card1.balance+'\n'+"卡内奖金:"+card1.bouns+'\n');
        System.out.println("卡号:"+card2.number+'\n'+"卡内余额:"+card2.balance+'\n'+"卡内奖金:"+card2.bouns+'\n');
        System.out.println("卡号:"+card3.number+'\n'+"卡内余额:"+card3.balance+'\n'+"卡内奖金:"+card3.bouns+'\n');
    }

}
