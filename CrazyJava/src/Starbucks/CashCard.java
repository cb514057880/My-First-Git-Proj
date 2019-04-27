package Starbucks;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/27 13:15
 * 4 * @
 * 5 *
 **/
public class CashCard {
    /**卡号*/
    String number;
    /**余额*/
    int balance;
    /**奖金*/
    int bouns;

    /**构造函数是与类名相同的方法，包含了类中的各种属性*/
    public CashCard(String number, int balance, int bouns) {
        this.number = number;
        this.balance = balance;
        this.bouns = bouns;
    }
}
