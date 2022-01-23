package demo3;

public class Test6 {
    public static void main(String[] args) {
        /*完成两个整数变量值的互换。
        如：变量a为3，b为5。最终让a输出5，b输出3。 */
        int a=10;
        int b=20;
        //方法2
        a=a+b; //a=30
        b=a-b; //b=30-20=10
        a=a-b; //a=30-10=20
        System.out.println(a);
        System.out.println(b);
    }
}



        /*
        //方法1 借助中间变量完成
        int c=a;
        a=b;
        b=c;
        System.out.println(a); //20
        System.out.println(b); //10
        */


