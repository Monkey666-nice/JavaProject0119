package demo3;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(23%7); //余数为2
        //取模运算对于浮点数同样有效。
        System.out.println(10.6%5); //商为2，余数为0.6（浮点数由于精度问题，会有损失）
    }
}
