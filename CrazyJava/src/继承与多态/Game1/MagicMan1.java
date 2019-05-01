package 继承与多态.Game1;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/5/1 23:08
 * 4 * @
 * 5 *
 **/
public class MagicMan1 extends Role {

    @Override
    public void fight(){
        System.out.println("魔法攻击");
    }
    @Override
    public void cure(){
        System.out.println("魔法治愈");
    }
}
