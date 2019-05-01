package 继承与多态.Game1;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/5/1 23:09
 * 4 * @
 * 5 *
 **/
public class RPG {
    public static void main(String[] args) {

        demoSwordMan();
        demoMagicMan();

    }

    static void demoSwordMan(){
        SwordMan1 swordMan1 = new SwordMan1();
        swordMan1.setName("Justin");
        swordMan1.setLevel(1);
        swordMan1.setBlood(200);
        System.out.println("剑士："+"名字："+swordMan1.getName()+"等级："
                +swordMan1.getLevel()+"血量："+swordMan1.getBlood());
    }


    static void demoMagicMan(){
        MagicMan1 magicMan1 = new MagicMan1();
        magicMan1.setName("Monica");
        magicMan1.setLevel(1);
        magicMan1.setBlood(500);
        System.out.println("魔法师："+"名字："+magicMan1.getName()+"等级："
                +magicMan1.getLevel()+"血量："+magicMan1.getBlood());
    }
}
