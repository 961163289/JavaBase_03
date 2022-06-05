package 三元运算符;

public class TernaryOperator {
    public static void main(String[] args) {

        int a = 10;
        int b = 99;
        //解读:
        //1. a > b 为 false
        //2. 返回 b--, 先返回 b的值,然后在 b-1
        //3. 返回结果是99
        int result = a > b ? a++ : b--;
        System.out.println("result=" + result +
                ", a = " + a + ", b = " + b);//result=99, a = 10, b = 98

    }
}
