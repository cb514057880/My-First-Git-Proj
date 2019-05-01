package 继承与多态.Game2;

import 继承与多态.Game1.*;

/**
 * 1 *
 * 2 * @Author: ChengBin
 * 3 * @Date: 2019/5/1 23:33
 * 4 * @
 * 5 *
 **/
public class RPG extends Role{

    public static void main(String[] args) {
        SwordMan1 swordMan1 = new SwordMan1();
        swordMan1.setName("justin");
        swordMan1.setLevel(1);
        swordMan1.setBlood(200);


        MagicMan1 magicMan1 = new MagicMan1();
        magicMan1.setName("monica");
        magicMan1.setLevel(1);
        magicMan1.setBlood(500);


        showBlood(swordMan1);
        showBlood(magicMan1);

        doFight(swordMan1);
        doFight(magicMan1);
        doCure(magicMan1);



    }



    static void showBlood(Role role){
        System.out.println("角色名字"+role.getName()+role.getBlood());
    }

    static void doFight(Role role){
        System.out.println(role.getName());
        role.fight();
    }

    static void doCure(Role role){
        role.cure();
    }



}
