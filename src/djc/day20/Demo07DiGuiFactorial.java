package djc.day20;

/*
递归求阶乘
*/
public class Demo07DiGuiFactorial {
    public static void main(String[] args) {
        int f = factorial(3);
        System.out.println(f); //6
    }

    //定义递归求阶乘的方法
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
