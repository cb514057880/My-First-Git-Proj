package 继承与多态.Game1;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/5/1 23:06
 * 4 * @
 * 5 *
 **/
public class Role {
    private String name;
    private int level;
    private int blood;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public  void fight(){
        //子类要重新定义fight（）的实际行为
    }

    public void cure(){

    }
}
