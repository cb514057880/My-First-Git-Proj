package DuiXiangFengZhuang;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/2/9 22:33
 * 4 * @124
 * 5 *
 **/
/*构造函数是与类名称同名的方法（method），不用声明返回类型（不用在构造函数前+类型）*/
//类名
 class CashCard {
    String number;
    int balance;
    int bonus;
//构造函数名
     CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
        //为了区别与类中的数据成员，构造方法的都加了this
    }/*
    CashCard cashCard1 = new CashCard("A0011",1000,0);
    CashCard cashCard2 = new CashCard("A0012",100,0);
    CashCard cashCard3 = new CashCard("A0013",1050,1);*/

}
