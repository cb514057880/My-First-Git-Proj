package LeiYuDuiXiang;

import java.math.BigDecimal;

public class DecimalDemo {
    public static void main(String[] args) {
        BigDecimal operand1 = new BigDecimal("1.0");
        BigDecimal operamd2 = new BigDecimal("0.8");
        BigDecimal result = operand1.subtract(operamd2);
        System.out.printf("结果等于："+result);
    }
}
