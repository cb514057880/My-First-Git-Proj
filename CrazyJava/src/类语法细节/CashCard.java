package 类语法细节;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/29 15:03
 * 4 * @
 * 5 *
 **/
public class CashCard {
       /**这个是公开类*/
       String number;
       int balance;
       int bouns;
       /**公用构造函数*/
       public CashCard(String number, int balance, int bouns) {
              this.number = number;
              this.balance = balance;
              this.bouns = bouns;
       }
       /**公开方法*/
       public void store(int money){
              /**略*/
       }

       public void charge(int money){
              /**略*/
       }

       public void exchange(int money){
              /**略*/
       }


       public int getBalance(){
              return balance;
       }

       public int getBouns(){
              return bouns;
       }

       public String getNumber(){
              return number;
       }

}
