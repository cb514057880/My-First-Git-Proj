package LeiYuDuiXiang;

class Clothes2{
    String color;
    char size;
    public Clothes2(String color, char size) {
        this.color = color;
        this.size = size;
    }
}
public class Filed2 {
    public static void main(String[] args) {
        Clothes2 sun = new Clothes2("red",'L');
        Clothes2 spring = new Clothes2("white",'X');

        System.out.printf("sun (%s,%c)%n",sun.color,sun.size,'\n');
        System.out.printf("spring (%s,%c)%n",spring.color,spring.size,'\n');

    }
}
