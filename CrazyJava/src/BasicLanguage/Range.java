package BasicLanguage;

public class Range {
    public static void main(String[] args) {
        //byte,short,int,long 范围
        System.out.printf("%d ~ %d%n",Byte.MIN_VALUE,Byte.MAX_VALUE);
        System.out.printf("%d ~ %d%n",Short.MAX_VALUE,Short.MIN_VALUE);
        System.out.printf("%d ~ %d%n",Integer.MAX_VALUE,Integer.MIN_VALUE);
        System.out.printf("%d ~ %d%n",Long.MAX_VALUE,Long.MIN_VALUE);

        //float,double 精度范围
        System.out.printf("%d ~ %d%n",Float.MAX_EXPONENT,Float.MIN_EXPONENT);
        System.out.printf("%d ~ %d%n",Double.MAX_EXPONENT,Double.MIN_EXPONENT);

        //char可表示的unicode范围
        System.out.printf("%h ~ %h%n",Character.MAX_VALUE,Character.MIN_VALUE);

        //boolean的两个值
        System.out.printf("%b ~ %b%n",Boolean.TRUE,Boolean.FALSE);
    }
}
