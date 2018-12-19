package LeiYuDuiXiang;
//浅层复制，复制参考，循环相当于更改了索引处所参考的对象
class Clothes1 {
    String color;
    char size;

    Clothes1(String color, char size) {
        this.color = color;
        this.size = size;
    }
}

public class ArrayShallowCopy {
    public static void main(String[] args) {
        Clothes1[] c1 = {new Clothes1("red", 'L'), new Clothes1("blue", 'M')};
        Clothes1[] c2 = new Clothes1[c1.length];
        //核心语句
        for (int i = 0; i < c1.length; i++) {
            c2[i] = c1[i];
        }
        c1[0].color = "yellow";
        System.out.println(c2[0].color);
    }
}