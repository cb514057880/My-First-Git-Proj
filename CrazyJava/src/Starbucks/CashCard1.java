package Starbucks;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/27 13:46
 * 4 * @
 * 5 *
 **/
public class CashCard1 {
    String numeber;
    int balance;
    int bouns;

    public CashCard1(String numeber, int balance, int bouns) {
        this.numeber = numeber;
        this.balance = balance;
        this.bouns = bouns;
    }

    /**
     * 储值方法
     */
    void store(int money) {
        if (money > 0) {
            this.balance += money;
            if (money >= 1000) {
                this.bouns++;
            }
        } else {
            System.out.println("储值金额不能为负数，请检查后重新输入");
        }
    }


    /**
     * 消费方法
     */
    void charge(int money) {
        if (money > 0) {
            if (this.balance >= money) {
                this.balance -= money;
            } else {
                System.out.println("余额不够此次消费，请充值");
            }
        } else {
            System.out.println("消费金额为负值，请重新输入");
        }
    }


    /**
     * 充值红利方法
     */

    int exchange(int bouns) {
        if (this.bouns >= bouns) {
            this.bouns -= bouns;
        }else {
            System.out.println("红利不够抵扣");
        }
        return this.bouns;
    }
}
