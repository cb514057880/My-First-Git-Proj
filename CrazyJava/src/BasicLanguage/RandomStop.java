package BasicLanguage;
public class RandomStop {
    public static void main(String[] args) {
        while (true){
            /*随机产生0-9的数字*/
            int number = (int) (Math.random()*10);
            System.out.printf("number"+'='+number+"\n");
            if (number==5){
                System.out.println("I hit 5...orz");
                break;
            }
        }
    }

}
