package demo6;

public class Test3 {
    public static void main(String[] args) {
        //条件运算符   条件? 值1 : 值2
        int a=true?10:20; //当条件为真，就将值1赋值给a，当条件为假，就将值2赋值给a
        System.out.println(a);//10

        int b=false?10:20;
        System.out.println(b);//20

        int i=10;
        int j=20;
        System.out.println(i>j?i:j);//谁大就输出谁
    }
}
