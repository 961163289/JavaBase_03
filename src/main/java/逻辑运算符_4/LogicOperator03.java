package 逻辑运算符_4;

public class LogicOperator03 {
    public static void main(String[] args) {
//        int x = 5;
//        int y = 5;
//        if (x++ == 6 & ++y == 6) {
//            x = 11;
//        }
//        System.out.println("x = " + x + ",y = " + y);//x = 6,y = 6

//        int x = 5;
//        int y = 5;
//        if (x++ == 6 && ++y == 6) {
//            x = 11;
//        }
//        System.out.println("x = " + x + ",y = " + y);//x = 6,y = 5

//        int x = 5;
//        int y = 5;
//        if (x++ == 5 | ++y == 5) {
//            x = 11;
//        }
//        System.out.println("x = " + x + ",y = " + y);//x = 11,y = 6

//        int x = 5;
//        int y = 5;
//        if (x++ == 5 || ++y == 5) {
//            x = 11;
//        }
//        System.out.println("x = " + x + ",y = " + y);//x = 11,y = 5

        boolean x = true;
        boolean y = false;
        short z = 46;
        if ((z++ == 46) && (y = true)) z++;
        if ((x = false) || (++z == 49)) z++;
        System.out.println("z = " + z);//50
    }
}
