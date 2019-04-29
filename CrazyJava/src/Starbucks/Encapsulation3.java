package Starbucks;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/4/27 22:20
 * 4 * @
 * 5 *
 **/
public class Encapsulation3 {
    class CashCard{
        /**使用private定义私有成员，自己理解为私有属性*/
        private String number;
        private int balance;
        private int bouns;


        void store(int money){
            if (money>0){
                this.balance+=money;
                if (money>=1000){
                    this.bouns++;
                }
            }else {
                System.out.println("储值是负值，请检查后重新输入");
            }
        }

        String getNumber(){
            return number;
        }



        int getBalance(){
            return balance;
        }

        int getBouns(){
            return bouns;
        }

    }
}
