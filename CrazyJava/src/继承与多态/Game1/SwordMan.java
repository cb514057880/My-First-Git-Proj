package 继承与多态.Game1;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/5/1 23:00
 * 4 * @
 * 5 *
 **/
public class SwordMan {
    private String name;  //角色名称
    private int level;    //角色等级
    private int blood;    //角色血量


    public void fight(){
        System.out.println("挥剑攻击");
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
