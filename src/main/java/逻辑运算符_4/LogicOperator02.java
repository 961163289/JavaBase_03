package 逻辑运算符_4;

public class LogicOperator02 {
    public static void main(String[] args) {

        int age = 50;

        //|| 短路或
        if (age > 20 || ++age < 30) {
            System.out.println("ok100");
        }

        //|  逻辑或
        if (age > 20 | age < 30) {
            System.out.println("ok200");
        }


        //区别
        int a = 4;
        int b = 9;
        //对于||短路或而言,如果第一个条件为true,后面的条件不再判断
        //对于|逻辑或而言,如果第一个条件为true,后面的条件仍然会判断
        if (a > 1 || ++b < 50) {
            System.out.println("ok300");
        }
        System.out.println("a = " + a + " b = " + b);

    }
}
