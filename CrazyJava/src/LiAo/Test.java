package LiAo;

import java.util.Arrays;

class Person{
    public Person(int a){
        //默认构造函数
    }
    private int id;
    private int age;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Test {
    public static void main(String[] args) {
        Person p = new Person(1);
        int[] a = {1,2,3,4,5};
        //        System.out.println(a[10]);
        //上面的写法在输出a[10]时显示下标越界，等同于下一行所写的方式
        Arrays b;

        //正确数组写法
        Person[] p1 = new Person[10];
        p1[0].setAge(1);
        p1[0].setId(10);
        System.out.println(p1[0]);
    }
}
