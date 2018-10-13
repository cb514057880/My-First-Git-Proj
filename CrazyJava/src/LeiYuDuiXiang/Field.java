package LeiYuDuiXiang;

class Clothes{
    String color;
    char size;
}
public class Field {
    public static void main(String[] args) {
        Clothes clothes1 = new Clothes();
        Clothes clothes2 = new Clothes();
        Clothes clothes3 = new Clothes();

        clothes1.color = "red";
        clothes1.size = 'L';

        clothes2.color = "black";
        clothes2.size = 'M';

        clothes3.color = "white";
        clothes3.size = 'L';

        System.out.printf("clothes1 (%s,%c)%n",clothes1.color,clothes1.size,'\n');
        System.out.printf("clothes2 (%s,%c)%n",clothes2.color,clothes2.size,'\n');
        System.out.printf("clothes3 (%s,%c)%n",clothes3.color,clothes3.size,'\n');

    }

}
