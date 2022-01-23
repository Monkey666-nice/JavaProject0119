package demo3;

public class Test8 {
    public static void main(String[] args) {
        int i=10;
        //i=i+1;
        //i+=1;
        //i++; //让变量自增1

        int b=i++;
        int c=++i;
        System.out.println(i);
        System.out.println(b);
        System.out.println(c);
    }
}
