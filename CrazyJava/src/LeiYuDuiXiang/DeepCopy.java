package LeiYuDuiXiang;
//深层复制，索引处的对象会被复制，所以被复制更改时，不影响已经复制的数组内容
class ClothesX{
    String color;
    char size;

    //构造方法
    public ClothesX(String color, char size) {
            this.color = color;
            this.size = size;
    }
}
public class DeepCopy {
    public static void main(String[] args) {
        ClothesX[] c1 = {new ClothesX("red",'l'),new ClothesX("blue",'m')};
        ClothesX[] c2 = new ClothesX[c1.length];
        //核心语句
        for (int i = 0;i < c1.length;i++){
            ClothesX c = new ClothesX(c1[i].color,c1[i].size);
            c2[i] = c;
        }
        c1[0].color = "yellow";
        System.out.println(c2[0].color);
    }
}
