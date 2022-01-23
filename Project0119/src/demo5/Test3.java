package demo5;

public class Test3 {
    public static void main(String[] args) {
        //短路或(||)运算，表达式若有一方为true，则整个结果就为true
        boolean b7=true || 1/0>1; //第一个条件已经为true，后面表达式的结果已经不重要了，结果都为true
        System.out.println(b7);// 第二个表达式若没有被执行，程序就不会异常

        boolean b8=true | 1/0>1; //逻辑或(|)运算，不管前面是否为true，后面表达式都会被执行
        System.out.println(b8);  //后面的表达式被执行了，程序会出现异常
    }
}
