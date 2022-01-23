package demo2;

public class Test3 {
    public static void main(String[] args) {
        short s=10;
        byte b=(byte)s;
        System.out.println(b);
        System.out.println(s);

        short t=300;     //300存储的时候，后面八位可能不够，前面的0中可能有的会变成1
        byte h=(byte)t;  //byte :-128~127
        System.out.println(h);

        int i=10; //int占用32比特，00000000 00000000 00000000 00001010
        short j=(short)i; //short占用16比特，变量i转化为short之后，00000000 00001010
        System.out.println(j); //因为损失的全是0，所以最终结果不变，还是10

        //int和char
        int a=98; //32bit  00000000 00000000 00000000 01100010
        char c=(char)a; //16bit  00000000 01100010 >>> Unicode >>>
        System.out.println(c);

        //浮点数和整数
        double p=3.1415;
        long l=(long)p;
        System.out.println(l);
    }
}
