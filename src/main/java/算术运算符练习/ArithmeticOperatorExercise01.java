package 算术运算符练习;

public class ArithmeticOperatorExercise01 {
    public static void main(String[] args) {

        /*int i = 1;//i->1
        i = i++;  //规则使用临时变量: (1)temp=i;(2)i=i+1;(3)i=temp
        System.out.println(i);//1

        int j = 1;//i->1
        j = ++j;  //规则使用临时变量: (1)i=i+1;(2)temp=i;(3)i=temp
        System.out.println(j);//2*/

        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.println("i = " + i);//10
        System.out.println("i2 = " + i2);//20
        i = --i2;
        System.out.println("i = " + i);//19
        System.out.println("i2 = " + i2);//19

    }
}