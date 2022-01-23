package demo2;

public class Test1 {
    public static void main(String[] args) {
        //从小到大，正常转换
        byte b=10;  //0000 1010
        System.out.println(b);
        short s=b;  //0000 0000 0000 1010
        System.out.println(s);
        int i=s;    //0000 0000 0000 0000 0000 0000 0000 1010
        System.out.println(i);
        long l=i;
        System.out.println(l);
        float f=l;
        System.out.println(f);
        double d=f;
        System.out.println(d);
    }
}
