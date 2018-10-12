package BasicLanguage;

public class RandomStop2 {
    public static void main(String[] args) {
        int number;
        do {
            number = (int) (Math.random()*10);
            System.out.printf("number"+'='+number+"\n");
        }while (number != 5);
        System.out.printf("i hit 5 ...orz");
    }
}
