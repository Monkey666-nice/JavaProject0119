package demo5;

public class Test2 {
    public static void main(String[] args) {
        int age=10;
        //          false      true
        boolean b3=age>=20 && age<=30;
        System.out.println(b3);

        //如果除数为0，那么就会出现ArithmeticException: / by zero的异常
        //System.out.println(1/0);

        boolean b4=false && 1/0 >1; //短路与运算，如果第一个值为false，那么后面就不执行了
        System.out.println(b4);//若第二个表达式没有被执行，程序就不会出现异常

      //  boolean b5=false & 1/0>1; //逻辑与运算，两个表达式无论什么情况都要执行
      //  System.out.println(b5); //会出现异常

        boolean b6=true && 1/0>1; //第一个表达式为true，后面表达式继续被执行
        System.out.println(b6); //程序会出现异常
    }
}
