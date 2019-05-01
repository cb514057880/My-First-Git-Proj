package 继承与多态.Game1;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/5/1 23:03
 * 4 * @
 * 5 *
 **/
public class MagicMan {
    private String name;
    private int level;
    private int blood;

    public void fight(){
        System.out.println("魔法攻击");
    }

    public void cure(){
        System.out.println("魔法治疗");
    }


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


}
