package demo5;

public class Test1 {
    public static void main(String[] args) {
        /*逻辑运算符  --> 运算结果是boolean类型
        * & 逻辑与运算   (并且)  --> 多个条件同时为true，则为true，一方为false，则为false。
        * | 逻辑或运算   (或者)  --> 多个条件任意一个为true，则为true。全为false，才为false。
        * &&短路与运算   (并且)  -->
        * ||短路或运算   (或者)  -->
        * ^ 逻辑异或运算
        * ! 逻辑非运算
         */
        boolean b=10>20 & 20<30; //前面结果与后面结果同时为真的时候，结果才为真
        System.out.println(b);   //false

        boolean b2=10>20 | 20<30 |30>40;
        System.out.println(b2); //true


    }
}
