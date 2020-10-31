package djc.day20;

/*
递归累加求和：
    计算1~n的和
*/
public class Demo06DiGuiSum {
    public static void main(String[] args) {
        int s = sumMethod(4);
        System.out.println(s); //10
    }

    //定义一个方法，使用递归计算1~n的和
    /*
    * 1+2+3+...+n
    * n+(n-1)+(n-2)+...+1
    * 已知：
    *   最大值：n
    *   最小值：1
    * 使用递归必须明确：
        递归的结束条件：获取到1时结束
        递归的目的：获取下一个被加的数字(n-1)*/
    public static int sumMethod(int n) {
        //获取到1时结束
        if (n == 1) {
            return 1;
        }
        //获取下一个被加的数字
        return n + sumMethod(n - 1);
    }
}
