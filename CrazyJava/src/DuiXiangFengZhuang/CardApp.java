package DuiXiangFengZhuang;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/2/9 22:40
 * 4 * @
 * 5 *
 **/
public class CardApp {
    public static void main(String[] args) {
        CashCard[] cards = {
                new CashCard("A000",500,0),
                new CashCard("A001",800,0),
                new CashCard("A002",1000,1),

        };
        for (CashCard card : cards){
            System.out.println('('+card.number+','+card.balance+','+card.bonus+')');
        }
    }
}
