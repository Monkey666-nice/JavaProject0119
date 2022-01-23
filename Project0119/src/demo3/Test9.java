package demo3;

public class Test9 {
    public static void main(String[] args) {
        int i=10;
        int j=5;
        // ++i --> i=11 ,然后使用的也是11
        // j-- --> 先使用j的值5，j再自减为4
        int b=++i + j--;//b=11+5=16
        System.out.println(i);
        System.out.println(j);
        System.out.println(b);
    }
}
