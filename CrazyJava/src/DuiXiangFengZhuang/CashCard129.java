package DuiXiangFengZhuang;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/3/1 01:05
 * 4 * @
 * 5 *
 **/
public class CashCard129 {
        private String number;
        private int balance;
        private int bouns;
        void store(int money){
            if (money>0){
                this.balance += money;
                if (money>=1000){
                    this.bouns++;
                }
            }
            else {
                System.out.println("储值是负值？你是乱来的嘛？");
            }
        }

        int getBalance(){
            return balance;
        }

        int getBouns(){
            return bouns;
        }

        String getNumber(){
            return number;
        }




}
