package demo3;

import com.sun.javaws.IconUtil;

public class Test3 {
    public static void main(String[] args) {
        /*倒序输出：
        准备任意一个四位整数，倒叙输出。如：1234 >>> 4321 */
        int i=1234;
        //先输出4，再输出3/2/1
        int g=i%10; //g=4
        int s=i/10%10; //s=3
        int b=i/100%10;  //b=2
        int q=i/1000; //q=1
        System.out.print(g); //当输出语句带ln的时候(println)，就表示换行
        System.out.print(s);
        System.out.print(b);
        System.out.print(q);
    }
}
