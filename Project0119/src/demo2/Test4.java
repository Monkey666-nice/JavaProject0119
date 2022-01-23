package demo2;

public class Test4 {
    public static void main(String[] args) {
        //除法两端如果是整数，那么结果只保留整数部分
        System.out.println(10/3);
        //除法两端任意一端是浮点数，那么结果就以浮点数保存，默认以double存储
        System.out.println(10.0/3);
        System.out.println(10/3.0);

        //给定任意一个浮点数
        double value=3.1415926;
        //要求输出 保留两位小数 考虑四舍五入
        double v2=value*100+0.5; //314.15+0.5=314.65
        int v3=(int)v2; //314
        System.out.println(v3/100.0); //3.14

        //给定任意一个浮点数
        double value2=3.14675;
        //要求输出 保留两位小数 考虑四舍五入
        double v4=value2*100+0.5; //314.675+0.5=315.175
        int v5=(int)v4; //315
        System.out.println(v5/100.0); //3.15
    }
}
