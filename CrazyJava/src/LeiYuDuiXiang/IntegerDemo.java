package LeiYuDuiXiang;

public class IntegerDemo {
    public static void main(String[] args) {
        int data1 = 10;
        int data2 = 20;
        Integer wrapper1 = new Integer(data1);
        Integer wrapper2 = new Integer(data2);
        System.out.printf("等于"+data1/ 3);
        System.out.println(wrapper1.doubleValue()/3);
        System.out.println(wrapper1.compareTo(wrapper2));

//        Integer data1 = 10;
//        Integer data2 = 20;
//        Integer wrapper1 = new Integer(data1);
//        Integer wrapper2 = new Integer(data2);
//        System.out.printf("等于"+data1/ 3);
//        System.out.println(data1.doubleValue()/3);
//        System.out.println(data1.compareTo(data2));
    }
}
