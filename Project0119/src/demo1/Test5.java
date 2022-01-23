package demo1;

public class Test5 {
    public static void main(String[] args) {
        //char 只能存储一个字符，使用单引号包裹字符
        char c='你';
        System.out.println(c);
        char d='h';
        System.out.println(d);
        //用char存储单引号，单引号有特殊含义，它是单个字符两端的边界符号
        //单引号当做文字来使用的话，不能直接写，在前面写一个斜线就好啦。
        char e='\'';
        System.out.println(e);

        char f='\\';    //这两个连这写，但是是一个字符哦
        System.out.println(f);

        char g='\t';    //横向跳格 对应键盘上的Tab 制表符  跳格8个字符
        System.out.println("my"+g+"fashion");

        char h='\b';    //往前删掉一个字符
        System.out.println("my"+h+"fashion");

        char i='\r';    //让光标回跳到最前，就感觉前面的“my”被删掉了
        System.out.println("my"+i+"fashion");

        char k='\n';    //换行转义字符
        System.out.println("my"+k+"fashion");
    }
}
