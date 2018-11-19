package improveFor;

import java.security.PublicKey;
import java.util.*;

//https://blog.csdn.net/qq_34178998/article/details/78651611
//集合边遍历，边删除用iterator和remove方法
public class Demo2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        //添加元素
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");

        /*使用迭代器遍历set的集合*/
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String temp = iterator.next();
            System.out.println("元素:" + temp);
            iterator.remove();
        }

        /*使用for循环遍历*/
        for (String item : set){
            System.out.println("元素："+ item);
        }

        int [] arr = {12,5,6,1};
        //普通for循环
        for (int i = 0;i<arr.length;i++){
            System.out.println("元素:"+ arr[i]);
        }


        //增强型For循环
        for (int item : arr){
            System.out.println("元素:"+ item);
        }

        //在控制台打印五句hello world
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("hello world");
        }

        //注意： Map集合没有实现Iterable接口，所以map集合不能直接使用增强for循环，
        // 如果需要使用增强for循环需要借助于Collection的集合。
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("001","张三");
        map.put("002","李四");
        map.put("003","赵六");
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> entry : entrySet){
            System.out.println("键:"+ entry.getKey()+"值:"+entry.getValue());
        }
    }
}
