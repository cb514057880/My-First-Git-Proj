package DuiXiangFengZhuang;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.Scanner;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/2/9 22:49
 * 4 * @
 * 5 *
 **/
public class CashCard126 {
    /**
     * 卡号
     */
    String number;
    /**
     * 余额
     */
    int balance;
    /**
     * 红利点数
     */
    int bonus;

    public CashCard126(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    /**在类中定义方法，如果不用返回值，方法名称前可以声明void
     * 如果需要返回值，在方法明前加返回值类型就ok*/
    /**
     * 充值方法
     */
    void store(int money) {
        if (money > 0) {
            this.balance += money;
            if (money > 1000) {
                this.bonus++;
            }
        } else {
            System.out.println("储值为负值");
        }

    }

    /**
     * 消费方法
     */
    int charge(int money) {
        if (money > 0) {
            if (this.balance >= money) {
                this.balance -= money;
            } else {
                System.out.println("余额不够本次消费，余额为" + this.balance);
            }
        } else {
            System.out.println("消费金额不可能为负值，输入错误，请重新输入");
        }
        return this.balance;
    }

    /**
     * 兑换红利点数
     */

    int exchange(int money) {
        if (money >= 500) {
            this.bonus++;
        }
        return bonus;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CashCard126 card1 = new CashCard126("A001", 500, 0);
        System.out.println("请输入储存金额：");
        card1.store(scanner.nextInt());
        System.out.println("请输入消费金额：");
        card1.charge(scanner.nextInt());
        System.out.println(
                        "卡号为：" + card1.number + "\n"+
                        "剩余金额为：" + card1.balance + '\n' +
                        "可兑换红利点数为：" + card1.bonus + '\n'
        );

        /**下同上*/
        CashCard126 card2 = new CashCard126("A002", 1500, 0);
        card2.store(scanner.nextInt());


        CashCard126 card3 = new CashCard126("A003", 2500, 0);

    }

}



