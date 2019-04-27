package Starbucks;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/27 13:27
 * 4 * @
 * 5 *
 **/
public class Way2 {
    public static void main(String[] args) {
        CashCard [] cards = {
                new CashCard("004",250,0),
                new CashCard("005",300,0),
                new CashCard("006",350,0),
                new CashCard("007",400,0),
                new CashCard("008",450,0)
        };
        for (CashCard card :cards){
            System.out.println(card.number+'\n'+card.balance+'\n'+card.bouns+'\n');
        }
    }
}
