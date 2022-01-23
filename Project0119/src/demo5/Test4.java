package demo5;

public class Test4 {
    public static void main(String[] args) {
        //异或运算：相同则为假（false），不同则为真（true）。
        boolean b9=10>20 ^ 20<30;
        //         false    true  --> true
        System.out.println(b9);

        boolean b10=10<20 ^ 20<30;
        //           true    true --> false
        System.out.println(b10);
    }
}
