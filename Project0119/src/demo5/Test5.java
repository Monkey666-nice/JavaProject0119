package demo5;

public class Test5 {
    public static void main(String[] args) {
        //逻辑非（！）
        boolean b11=!(10<20);
        //10<20为true，加上！之后为false。
        System.out.println(b11);

        boolean b12=10>20;//10>20为false
        System.out.println(!b12);//加上叹号！后，输出相反，为true
    }
}
