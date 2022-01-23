package demo3;

public class Test10 {
    public static void main(String[] args) {
        int a=10;
        int b=a++; //b=10 a=11
        //(--b)-->9 ,b=9 ;(++a)-->12 ,a=12
        int c=(--b)+(++a); //c=9+12=21
        //(c++)-->21 ,c=22 ;(a--)-->12 ,a=11 ;(++b)-->10 ,b=10
        int d=(c++)-(a--)+(++b);//d=21-12+10=19
        //(--d)-->18 ,d=18 ;(c++)-->22 ,c=23 ;(++b)-->11 ,b=11 ;(a--)-->11 ,a=10
        int e=(--d)+(c++)-(++b)+(a--);//e=18+22-11+11=40
        System.out.println(a);//10
        System.out.println(b);//11
        System.out.println(c);//23
        System.out.println(d);//18
        System.out.println(e);//40
    }
}
