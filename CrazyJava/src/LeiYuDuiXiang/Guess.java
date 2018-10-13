package LeiYuDuiXiang;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random()*10);
        int guess;
        do {
            System.out.println("猜数字0—9：");
            guess = scanner.nextInt();
        }while (guess != number);
        System.out.printf("猜中了");
    }
}
